<template>
  <main>
    <section v-for="dashboard in dashboards"
             :key="dashboard.id"
             @drop="onDrop($event,dashboard.id)"
             class="droppable"
             @dragover.prevent
             @dragenter.prevent>
      <h4>{{ dashboard.title }}</h4>
      <Sticker v-for="sticker in stickers.filter(x => x.dashboardId===dashboard.id)"
               :key="sticker.id"
               v-bind:msg="sticker.title"
               @dragstart="onDragStart($event, sticker)"
               class="draggable"
               draggable="true">
      </Sticker>
    </section>
  </main>
</template>

<script>
import Sticker from './Sticker.vue'
import {ref} from 'vue'

export default {
  setup() {
    const stickers = ref([
      {
        id: 0,
        title: 'todo1',
        dashboardId: 0
      },
      {
        id: 1,
        title: 'todo2',
        dashboardId: 0
      }, {
        id: 2,
        title: 'todo3',
        dashboardId: 1
      }, {
        id: 3,
        title: 'todo4',
        dashboardId: 1
      }, {
        id: 4,
        title: 'todo5',
        dashboardId: 2
      }
    ])
    const dashboards = ref([
      {
        id: 0,
        title: 'TODO'
      },
      {
        id: 1,
        title: 'IN PROGRESS'
      },
      {
        id: 2,
        title: 'DONE'
      }
    ])

    function onDragStart(e, sticker) {
      e.dataTransfer.dropEffect = 'move'
      e.dataTransfer.effectAllowed = 'move'
      e.dataTransfer.setData('stickerId', sticker.id.toString())
    }

    function onDrop(e, dashboardId) {
      const stickerId = parseInt(e.dataTransfer.getData('stickerId'))
      stickers.value = stickers.value.map(x => {
        if (x.id === stickerId)
          x.dashboardId = dashboardId
        return x
      })
    }

    return {
      stickers,
      dashboards,
      onDragStart,
      onDrop
    }
  },
  components: {
    Sticker
  }

}
</script>

<style scoped>

section {
  margin: 0 auto;
  width: 100%;
  text-align: center;
  display: flex;
  align-items: center;
  flex-direction: column;
}

main {
  /*margin: 50px;*/
  margin: 0px;
  display: flex;
}
</style>

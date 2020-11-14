<template>
  <main class="column column-center">
      <section class="row">
            <section class="column column-center">
                <h4>SPRINTS</h4>
            </section>
            <section v-for="dashboard in dashboards"
                 :key="dashboard.id"
                 @drop="onDrop($event,dashboard.id)"
                 class="droppable column"
                 @dragover.prevent
                 @dragenter.prevent
                 @dragenter="dragEnter"
                 @dragend="dragEnd"
                 @dragleave="dragLeave">

                <h4>{{ dashboard.title }}</h4>

                <Sticker v-for="sticker in stickers.filter(x => x.dashboardId===dashboard.id)"
                       :key="sticker.id"
                       v-bind:msg="sticker.title"
                       @dragstart="onDragStart($event, sticker)"
                       class="draggable"
                       draggable="true">
                </Sticker>
            </section>
      </section>

      <section class="column column-center">
        <h4>BACKLOG</h4>
        <div class="btn">+</div>
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

    function dragEnd() {
      this.classList.remove('over');
    }

    function dragEnter(e) {
      e.target.classList.add('over');
    }

    function dragLeave(e) {
      e.target.classList.remove('over');
    }

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
      e.target.classList.remove('over');
    }

    return {
      stickers,
      dashboards,
      onDragStart,
      dragLeave,
      dragEnter,
      dragEnd,
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
  margin: 1rem;
  width: 100%;
  text-align: center;
  background-color: #e9ecef;
}

section.over {
 /* border: 3px dotted #666; */
  border-width: 3px;
  border-style: dashed;
  border-radius: 1em;
  border-width: 0.09 rem;
  border-color: #666;
}

main {
  /*margin: 50px;*/
  margin: 0px;
  //display: flex;
}
</style>

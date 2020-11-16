<template>
  <Section v-for="section in sections"
           :key="section.id"
           v-bind:section="section"
           v-bind:stickerList="stickers.filter(x => x.status===section.status)"
           @drop="onDrop($event,section.status)"
           class="droppable column column-center colored-section "
           @dragover.prevent
           @dragenter.prevent
           @dragenter="dragEnter"
           @dragend="dragEnd"
           @dragleave="dragLeave">

    <h4>{{ sections.title }}</h4>
  </Section>
</template>

<script>
import {ref} from 'vue'
import Section from "@/components/section/Section";

export default {
  props: {
    stickerList: Array
  },
  data() {
    return {
      stickers: this.stickerList
    }
  },
  setup() {
    const sections = ref([
      {
        id: 0,
        title: 'TODO',
        status: 'todo'
      },
      {
        id: 1,
        title: 'IN PROGRESS',
        status: 'inprogress'
      },
      {
        id: 2,
        title: 'DONE',
        status: 'done'
      }
    ])

    return {
      sections
    }
  },
  methods: {

    dragEnd(e) {
      e.target.classList.remove('over');
    },

    dragEnter(e) {
      e.target.classList.add('over');
    },

    dragLeave(e) {
      e.target.classList.remove('over');
    },
    onDrop(e, sectionStatus) {
      const stickerId = parseInt(e.dataTransfer.getData('stickerId'))
      console.log(this.stickers)
      this.stickers = this.stickers.map(x => {
        if (x.id === stickerId)
          x.status = sectionStatus
        return x
      })
      console.log(this.stickers)

      e.target.classList.remove('over');
    }

  },
  components: {
    Section
  }

}
</script>

<style scoped>
</style>

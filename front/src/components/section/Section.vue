<template>
  <section>

    <h4>{{ section.title }}</h4>
    <StickerList v-bind:stickerList="stickerList"/>

  </section>
</template>

<script>
import StickerList from '../sticker/StickerList.vue'

export default {
  props: {
    section: Object,
    stickerList: Array
  },
  data() {
    return {
      stickers: this.stickerList
    }
  },

  components: {
    StickerList
  }

}
</script>

<style scoped>

section {
  margin: 1rem;
  width: 100%;
  text-align: center;
}

.colored-section {
  background-color: #e9ecef;
}

section.over {
  /* border: 3px dotted #666; */
  border-width: 3px;
  border-style: dashed;
  border-radius: 1em;
  border-width: 0.09rem;
  border-color: #666;
}
</style>

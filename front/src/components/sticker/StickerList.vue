<template>
  <Sticker v-for="sticker in stickerList"
           :key="sticker.id"
           v-bind:sticker="sticker">
  </Sticker>
</template>

<script>
import Sticker from './Sticker.vue'

export default {
  props: {
    stickerList: Array
  },

  components: {
    Sticker
  }

}
</script>

<style scoped>

</style>

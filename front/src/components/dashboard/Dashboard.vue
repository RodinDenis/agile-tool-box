<template>
  <main class="column column-center">
    <SectionList v-bind:stickerList="stickerList"/>
  </main>
</template>

<script>
import SectionList from '../section/SectionList.vue'

export default {
  props: {
    stickerList: Array
  },
  components: {
    SectionList
  }

}
</script>

<style scoped>
main {
  /*margin: 50px;*/
  margin: 0px;
  display: flex;
}
</style>

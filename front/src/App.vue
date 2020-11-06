<template>
  <div id="app">
    <div>
      <h2>TO DO</h2>
      <Sticker
          v-for="sticker in stickers" :key="sticker.message"
          v-bind:msg="sticker.message"/>
    </div>
  </div>
</template>

<script>
import Sticker from './components/Sticker.vue'

export default {
  name: 'App',
  components: {
    Sticker
  },
  data() {
    return {
      stickers: [
        {message: 'todo1'},
        {message: 'todo2'}
      ]
    }
  },
}
</script>

<template>
  <main id="app">
    <section>
      <h2>TODO</h2>
      <Sticker
          v-for="sticker in stickers" :key="sticker.message"
          v-bind:msg="sticker.message"/>
    </section>
    <section>
      <h2>IN PROGRESS</h2>
    </section>
    <section>
      <h2>Done</h2>
    </section>
  </main>
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


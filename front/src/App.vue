<template>
<div id="app">
  <Sticker
  v-for="(todo) in todos"
  v-bind:mess="todo"/>
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
        todos: [
          'todo 1',
          'todo 2',
          'todo 3'
        ]
      }
    },
}
</script>

<style>

</style>

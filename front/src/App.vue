<template>
  <h2 id="sprint-goal"><i>Sprint Goal</i>: Create a whiteboard with moving stickers</h2>
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

<style scoped>

#sprint-goal {
    text-align:center;
}

main {
    margin: 50px;
    display: flex;
}

section {
    margin: 0 auto;
    width: 100%;
    text-align: center;
    display: flex;
    align-items: center;
    flex-direction: column;
}

section H2 {
  font-family: 'Shadows Into Light', cursive;
  text-decoration: underline;
}

</style>
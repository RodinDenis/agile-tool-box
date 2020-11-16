<template>
  <div>
    <Sprint v-for="(sprint) in sprints"
            :key="sprint.id"
            v-bind:sprint="sprint"/>
  </div>
</template>

<script>
import Sprint from './Sprint.vue'

export default {
  props: {
    sprints: Array
  },
  setup(props) {
    console.log(props.sprints)
  },
  components: {
    Sprint
  }
}
</script>

<style scoped>
</style>

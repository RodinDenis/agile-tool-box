<template>
  <div>
    <SprintGoal/>
    <Dashboard/>
  </div>
</template>

<script>
import SprintGoal from './components/SprintGoal'
import Dashboard from './components/Dashboard.vue'

export default {
  name: 'App',
  components: {
    SprintGoal, Dashboard
  }
}
</script>

<style scoped>

</style>

<template>
  <div>
    <SprintGoal/>
    <Dashboard/>
  </div>
</template>

<script>
import SprintGoal from '../components/SprintGoal'
import Dashboard from '../components/dashboard/Dashboard.vue'

export default {
  components: {
    SprintGoal, Dashboard
  }
}
</script>

<style scoped>

</style>

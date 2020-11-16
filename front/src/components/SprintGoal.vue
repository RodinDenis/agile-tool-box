<template>
  <h2 id="sprint-goal">
    {{sprintGoal}}
  </h2>
</template>

<script>
export default {
  props:{
    sprintGoal:String
  }
}
</script>

<style scoped>

#sprint-goal {
  text-align: center;
}

H2 {
  font-family: 'Shadows Into Light', cursive;
  text-decoration: underline;
}
</style>
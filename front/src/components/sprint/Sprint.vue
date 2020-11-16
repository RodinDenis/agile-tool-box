<template>
  <div>
    {{sprint}}
  </div>
</template>

<script>
  export default {
    props:{
      sprint:Object
    },
    setup(props){
      console.log(props.sprint)
    }
  }
</script>

<style scoped>

</style>

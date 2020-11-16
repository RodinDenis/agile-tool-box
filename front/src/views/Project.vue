<template>
  <div>
    <SprintGoal v-bind:sprint-goal="sprintGoal"/>
    <SprintList v-bind:sprints="sprintList"/>
    <Dashboard v-bind:sticker-list="stickerList"/>
  </div>
</template>

<script>
import SprintGoal from '../components/SprintGoal'
import SprintList from '../components/sprint/SprintList.vue'
import Dashboard from '../components/dashboard/Dashboard.vue'

export default {
  components: {
    SprintGoal, SprintList, Dashboard,
  },
  setup() {
    const sprintGoal = "Sprint Goal: Create a whiteboard with moving stickers";
    const sprintList = [];
    const stickerList = [
      {
        id: 0,
        title: 'todo1',
        status: 'todo'
      },
      {
        id: 1,
        title: 'todo2',
        status: 'inprogress'
      }, {
        id: 2,
        title: 'todo3',
        status: 'done'
      }, {
        id: 3,
        title: 'todo4',
        status: 'inprogress'
      }, {
        id: 4,
        title: 'todo5',
        status: 'todo'
      }
    ];

    return {
      sprintGoal,
      sprintList,
      stickerList
    };
  }
}
</script>

<style scoped>

</style>

<template>
  <div class="draggable sticker"
       @dragstart="onDragStart($event)"
       draggable="true">
    <span class="text">{{ sticker.title }}</span>
  </div>
</template>

<script>
export default {
  name: 'Sticker',
  props: {
    sticker: Object
  },
  methods: {
    onDragStart(e) {
      e.dataTransfer.dropEffect = 'move'
      e.dataTransfer.effectAllowed = 'move'
      e.dataTransfer.setData('stickerId', this.sticker.id.toString())
    }
  }
}


</script>

<style scoped>
@import url(https://fonts.googleapis.com/css?family=Shadows+Into+Light);
@import url(https://fonts.googleapis.com/css?family=Bitter:400,700);

.sticker {
  position: relative;
  width: 160px;
  height: 70px;
  font-size: 1.5em;
  font-weight: bold;
  margin: 30px;
  background-color: #fcf59b;
  border-radius: 0px 10px 250px / 0 200px 55px 250px;
  -webkit-box-shadow: -3px 5px 12px 0 rgba(0, 0, 0, 0.3);
  -moz-box-shadow: -3px 5px 12px 0 rgba(0, 0, 0, 0.3);
  box-shadow: -3px 5px 12px 0 rgba(0, 0, 0, 0.3);
}

.sticker:hover {

  -webkit-box-shadow: -5px 10px 12px 0 rgba(0, 0, 0, 0.3);
  -moz-box-shadow: -5px 10px 12px 0 rgba(0, 0, 0, 0.3);
  box-shadow: -5px 10px 12px 0 rgba(0, 0, 0, 0.3);
}

/* Text on the sticker*/
.text {
  text-align: center;
  display: block;
  padding: 20px 20px 20px 0;
  font-size: 80%;
  font-family: 'Shadows Into Light', cursive;
}

/* Shadow under sticker */
.sticker::before {
  content: '';
  display: block;
  position: absolute;
  z-index: -1;
  width: 90%;
  height: 20px;
  -webkit-box-shadow: 3px 17px 6px rgba(0, 0, 0, .3);
  -moz-box-shadow: 3px 17px 6px rgba(0, 0, 0, .3);
  box-shadow: 3px 17px 6px rgba(0, 0, 0, .3);
  bottom: 15px;
  right: 5px;
  -ms-transform: skew(-10deg, 2deg);
  -webkit-transform: skew(-10deg, 2deg);
  transform: skew(-10deg, 2deg);
}

/* Curl */
.sticker::after {
  content: '';
  display: block;
  position: absolute;
  width: 0;
  height: 0;
  right: 8px;
  bottom: 1px;
  border-top: 10px solid rgb(156, 166, 61);
  border-right: 10px solid transparent;
  -webkit-transform: skew(-55deg, 10deg);
  transform: skew(-55deg, 10deg);
}
</style>
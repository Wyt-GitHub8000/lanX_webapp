<template>
    <div>
        <span class="top-card-order-triangle"></span>
        <span class="top-card-order-text">{{index}}</span>
    </div>
</template>

<script>
    export default {
        name: 'CornerMarker',
        props:{
            index:Number
        }
    }
</script>

<style scoped>
    .top-card-order-triangle{
        position: absolute;
        top: 0;
        left: 0;
        width: 0;
        height: 0;
        border-top: 34px solid #0381FF;
        border-right: 34px solid transparent;
    }
    .top-card-order-text{
        display: block;
        position: absolute;
        top: 7px;
        left: 7px;
        width: 6px;
        height: 10px;
        font-size: 10px;
        line-height: 10px;
        color: #fff;
        z-index: 10;
        word-break: normal;
        word-wrap: normal;
    }
</style>

<template>
    <keep-alive>
        <router-view></router-view>
    </keep-alive>
</template>

<script>
    export default {
        name: 'App',
    }
</script>

<style lang="scss">
    #app{
        /*100%屏幕高度*/
        height: 100vh;
    }
</style>

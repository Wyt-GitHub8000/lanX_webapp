<template>
    <div class="content">
        <router-view></router-view>
    </div>
</template>

<script>
    export default {
        name: 'CommonContent',
    }
</script>

<style scoped>
    .content{
        border: 15px solid #f2f2f2;
        background-color: #f2f2f2;
    }
</style>

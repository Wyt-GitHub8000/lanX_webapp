<template>
    <div id="main">
        <div class="header-warp"><common-header></common-header></div>
        <div class="content-warp"><common-content></common-content></div>
        <div class="footer-warp"><common-footer></common-footer></div>
    </div>
</template>

<script>
    import CommonHeader from './CommonHeader.vue'
    import CommonContent from './CommonContent.vue'
    import CommonFooter from './CommonFooter.vue'
    export default {
        name: 'Main',
        components: {
            CommonHeader,
            CommonContent,
            CommonFooter,
        }
    }
</script>

<style scoped>

</style>

<style>
    *{
        margin: 0;
        padding: 0;
    }
    #main{
        display: flex;
        flex-direction: column;
        min-height: 100vh;
    }
    .header-warp{
        width: 100%;
        height: 52px;
    }
    .content-warp{
        width: 100%;
        flex: 1;
        background-color: #f2f2f2;
    }
    .footer-warp{
        width: 100%;
        height: 176px;
    }
</style>

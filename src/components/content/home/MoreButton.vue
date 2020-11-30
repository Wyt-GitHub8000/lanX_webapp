<template>
    <div class="more">
        <!--<button>更多</button>-->
        <!--通过vant中的插件实现loading效果，后续自己可以实现一个-->
        <van-button :loading="flag" loading-type="spinner" @click="moreClick">更多</van-button>
    </div>
</template>

<script>
    export default {
        name: 'MoreButton',
        props:{
          flag:Boolean
        },
        methods:{
            moreClick(){
                this.$emit('more-btn');
            }
        }
    }
</script>

<style lang="scss" scoped>
    .more {
        width: 100%;
        height: 45px;
        display: flex;
        justify-content: center;
        align-items: center;
        button {
            /*width: 53px;*/
            height: 25px;
            font-size: 10px;
            background-color: #25acf1;
            color: #e8f6fd;
            border: 1px solid #25acf1;
            border-radius: 3px;
        }
    }
</style>

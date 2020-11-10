<template>
    <div class="header">
        <div class="navbtn">
            <van-button icon="wap-nav" color="#25acf1" @click="listShow()"></van-button>
        </div>
        <div class="logo">
            <div>蓝犀互娱</div>
        </div>
        <input type="text" id="" placeholder="搜索"  />
        <!--通过遮罩控制侧边导航菜单的隐藏-->
        <!--<div>-->
            <!--<div class="nav-sidebar__shade"></div>-->
            <!--<ul class="nav">-->
                <!--<li @click="clickMenu(item)" v-for="item in navMenu">{{item.label}}</li >-->
            <!--</ul>-->
        <!--</div>-->
        <ul class="nav">
            <li @click="clickMenu(item)" v-for="item in navMenu">{{item.label}}</li >
        </ul>
    </div>
</template>

<script>
    export default {
        name: 'CommonHeader',
        methods: {
            listShow(){
                if(this.isShow){
                    $('.nav').animate({left:'-176px'})
                }else {
                    $('.nav').animate({left:'0px'});
                }
                this.isShow = ! this.isShow;
            },
            clickMenu(item){
                $('.nav li').click(function() {
                    $(this).addClass('current');
                    $(this).siblings('.current').removeClass('current');
                })
                this.$router.push({name: item.name})
            }
        },
        data(){
            return {
                isShow:false,
                navMenu: [
                    {
                        path: '/',
                        name: 'home',
                        label: '首页',
                    },
                    {
                        path: '/rank',
                        name: 'rank',
                        label: '排行榜',
                    },
                    {
                        path: '/news',
                        name: 'news',
                        label: '资讯',
                    },
                    {
                        path: '/find',
                        name: 'find',
                        label: '发现',
                    },
                    {
                        path: '/viedo',
                        name: 'viedo',
                        label: '视频',
                    }
                ]
            }
        }
    }
</script>

<style lang="scss">
    .header{
        background-color: #25acf1;
        position: fixed;
        width: 100vw;
        display: flex;
        z-index:999;
    }
    .header .logo{
        display: inline-block;
        color: #fff;
        margin-right: 56px;
        font-size: 12px;
        line-height: 52px;
    }
    .van-button {
        padding-left: 17px;
        border: none;
        height: 52px;
    }
    .header input{
        width: 196px;
        height: 22px;
        margin-top: 14px;
        border-radius: 18px;
        background-color: #5cc1f5;
        border: 1px solid #5cc1f5;
        padding-left: 10px;
    }
    .header input:focus{
        outline: none;
        border: 1px solid #5cc1f5;
    }
    .header input::-webkit-input-placeholder{
        color: #a1dffd;
        font-size: 10px;
    }
    .header .nav{
        background-color: #fff;
        width: 47vw;
        height: 100vh;
        position: absolute;
        left: -176px;
        top: 52px;
        z-index:999;
    }
    .nav li{
        width: 100%;
        height: 40px;
        font-size: 14px;
        line-height: 40px;
        color: #25acf1;
        padding-left: 29px;
    }
    .nav .current{
        background-color: #68ccff;
        color: #fff;
    }

    /*尝试颜色遮罩*/
    .nav-sidebar__shade{
        opacity: 1;
    }
    .nav-sidebar__shade{

    }
</style>

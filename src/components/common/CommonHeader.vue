<template>
    <div class="header">
        <div class="navbtn">
            <van-button icon="wap-nav" color="#25acf1" @click="listShow()"></van-button>
        </div>
        <div class="logo">
            <div>蓝犀互娱</div>
        </div>
        <input type="text" id="search" placeholder="原神" @click="clickInput"/>
        <ul class="nav">
            <li @click="clickMenu(item,index)" v-for="(item,index) in navMenu" :class="flag==index?'current':''">{{item.label}}</li >
        </ul>
        <div class="shade" @click="shadeClick"></div>
    </div>
</template>

<script>
    export default {
        name: 'CommonHeader',
        methods: {
            listShow(){
                if(this.isShow){
                    $('.nav').animate({left:'-375px'});
                    $('.shade').fadeOut(300);
                }else {
                    $('.nav').animate({left:'0px'});
                    $('.shade').fadeIn(300);
                }
                this.isShow = ! this.isShow;
            },
            shadeClick(){
               this.listShow()
            },
            clickMenu(item,index){
                //点击菜单项更改样式
                this.flag = index
                $('.nav li').click(function() {
                    $(this).addClass('current');
                    $(this).siblings('.current').removeClass('current');
                })
                this.listShow()
                //进行路由跳转
                this.$router.push({name: item.name})
            },
            clickInput(){
                this.$router.push('/search')
            }
        },
        data(){
            return {
                flag:0,
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
        height: 45px;
    }
    .header .logo{
        display: inline-block;
        color: #fff;
        margin-right: 56px;
        font-size: 12px;
        line-height: 48px;
    }
    .van-button {
        padding-left: 17px;
        border: none;
        height: 45px;
    }
    .header input{
        width: 196px;
        height: 22px;
        margin-top: 11px;
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
        top: 45px;
        z-index:999;
    }
    .header .shade{
        background-color: rgba(0,0,0,.5);
        width: 100vw;
        height: 100vh;
        position: absolute;
        top: 45px;
        display: none;
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
</style>

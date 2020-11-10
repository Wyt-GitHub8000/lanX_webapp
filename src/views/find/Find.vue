<template>
    <div>
        <img src="../../assets/images/find/lb.png">
        <found :item="findList">每日新发现</found>
        <found :item="findList">近期最热</found>
        <found :item="findList">最近更新</found>
        <found :item="findList">模拟</found>
        <found :item="findList">多人</found>
    </div>
</template>

<script>
    import Found from '../../components/content/find/Found.vue'
    export default {
        name: 'Find',
        data(){
          return{
              findList:[]
          }
        },
        components:{
            Found
        },
        mounted(){
            this.http.get('/find/getData').then(
                res=>{
                    res = res.data;
                    this.findList = res.findData
                }
            )
        }
    }
</script>

<style scoped>

</style>

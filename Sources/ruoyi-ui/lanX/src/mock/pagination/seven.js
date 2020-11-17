import Mock from 'mockjs'

let page7=[]

export default {
    getPage7Data:()=>{
        for(let i=0;i<14;i++){
            page7.push(Mock.mock(
                {
                    gameName:Mock.Random.ctitle(4,4),
                    gameType:Mock.Random.ctitle(2,2)
                }
            ))
        }
        return {
            code:2000,
            pageTotal:10,
            pageRows:140,
            pageData:page7
        }
    }
}
import Mock from 'mockjs'

let page1=[]

export default {
    getPage1Data:()=>{
        for(let i=0;i<14;i++){
            page1.push(Mock.mock(
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
            pageData:page1
        }
    }
}
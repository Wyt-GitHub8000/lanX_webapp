import Mock from 'mockjs'

let page3=[]

export default {
    getPage3Data:()=>{
        for(let i=0;i<14;i++){
            page3.push(Mock.mock(
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
            pageData:page3
        }
    }
}
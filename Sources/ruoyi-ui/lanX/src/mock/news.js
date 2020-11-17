import Mock from 'mockjs'

let newsList = []
let moreList = []

export  default {
    getNewsData:()=>{
        for(let i=0;i<4;i++){
            newsList.push(
                Mock.mock({
                    newsTitle:Mock.Random.cparagraph(1),
                    newsDate:Mock.Random.date('yyyy/MM/dd'),
                    newsCreater:Mock.Random.ctitle(3,4)
                })
            )
        }
        for(let i=0;i<3;i++){
            moreList.push(
                Mock.mock({
                    moreTitle:Mock.Random.ctitle(7,10),
                    moreCore:Mock.Random.integer(100,500),
                    moreDate:Mock.Random.date('MM-dd')
                })
            )
        }
        return {
            code:2000,
            newsData:newsList,
            moreDate:moreList
        }
}
}
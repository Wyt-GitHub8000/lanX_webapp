import Mock from 'mockjs'

let gameList=[]      //用来存放游戏相关的数据
let playerList=[]    //用来存放玩家相关的数据
let viedoList=[]     //用来存放视频相关的数据
export default {
    getRankData:()=>{
    for(let i=0;i<5;i++){
        gameList.push(
            Mock.mock({
                gameName:Mock.Random.ctitle(2,2),
                gameFirm:Mock.Random.string('abcdefg',4,6),
                gameType:Mock.Random.ctitle(2,4),
                gameDescribe:Mock.Random.cparagraph(2),
                gameTag1:Mock.Random.ctitle(2,4),
                gameTag2:Mock.Random.ctitle(2,4),
                gameTag3:Mock.Random.ctitle(2,4)
            })
        )
      }
     for(let i=0;i<8;i++){
        playerList.push(
            Mock.mock({
                playName: Mock.Random.ctitle(2,4),
                playCore: Mock.Random.float(3,5,1,1),
                playXing: Mock.Random.string("★",1,1),
                playFiled: Mock.Random.ctitle(2,4),
                playId: Mock.Random.string('abc45ed36',5,6),
                playFans: Mock.Random.integer(12368,102568),
                playWorks: Mock.Random.integer(123,10659)
            })
        )
     }
     for(let i=0;i<10;i++){
         viedoList.push(
             Mock.mock({
                 dzCount: Mock.Random.integer(1589,6892),
                 plCount: Mock.Random.integer(935,5963),
                 fxCount: Mock.Random.integer(693,1963),
                 viedoDescrib: Mock.Random.cparagraph(1,2),
                 viedoCreater: Mock.Random.ctitle(2,4)
             })
         )
     }
     return {
        code:2000,
        gameData: gameList,
        playData: playerList,
        viedoData: viedoList
     }
    }
}
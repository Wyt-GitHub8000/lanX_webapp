// 拦截网络请求

//导入axios网络模块
import axios from 'axios'

// 配置网络模块
const service = axios.create({
    timeout : 30
})

//请求拦截
service.interceptors.request.use(
    config =>{
        return config
    },error => {
        console.log(error)
    }
)

//响应拦截
service.interceptors.response.use(
    result =>{
        return result
    },error => {
        console.log(error)
    }
)

//导出网络模块,使组件中可以使用该模块发送网络请求
export default service
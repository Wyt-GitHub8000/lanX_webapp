const webpack = require('webpack')
module.exports = {
    //打包路径配置
    publicPath:'./',
    outputDir:'dist',
    assetsDir:'static',

    //服务器模块相关配置
    devServer: {
        port: 8080,
        public: '169.254.107.190:8080',
        open: true,
        /* 设置前端代理解决跨域访问问题
         proxy: {

         }*/
    },

    //css模块相关配置
    css: {
        loaderOptions: {
            sass: {
                prependData: '@import "@/assets/scss/_variable.scss";'
            }
        }
    },

    //webpack相关配置
    configureWebpack: {
        //插件配置
        plugins: [
            new webpack.ProvidePlugin({
                $: "jquery",
                jQuery: "jquery",
                "windows.jQuery": "jquery"
            })
        ],
        //文件别名配置
        resolve: {
            alias: {    // 默认 @ === src
                assets: "@/assets",
                components: "@/components",
                views: "@/views",
            }
        }
    }

}
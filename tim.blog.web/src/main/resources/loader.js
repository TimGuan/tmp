requirejs.config({
    paths: {
        lib: 'lib/',
        plugin: 'plugin/',
        compressed: 'compressed/',
        business: 'src/business',
        atwho: 'lib/jquery.atwho',
        jquery: 'lib/jquery/jquery-2.0.3',
        easyui: 'lib/jquery.easyui-1.3.3_c1.min',
        ext: 'lib/ext-all',
        backbone: 'lib/backbone/backbone',
        underscore: 'lib/backbone/underscore',
        text: "lib/text",
        caret: 'lib/jquery.caret',
        cc: 'compressed/cc-1.0.3.min',
        jsrender: 'lib/jquery/jsrender',
        bootstrap: 'lib/bootstrap/js/bootstrap',
        validate: 'lib/jquery/jquery.validate',
        validatePlus: 'lib/jquery/additional-methods',
        util: 'js/util',
        index: 'js/index',
        admin: 'js/admin',
        sinon: 'lib/sinon/sinon-1.7.3',
        messages: 'js/localization/messages_zh',
        ddsmoothmenu: 'lib/common/ddsmoothmenu/ddsmoothmenu',
        cycle: 'lib/common/cycle/jquery.cycle.all.min',
        jPlugins: 'lib/common/jPlugins'
    },
    shim: {
        backbone: ['underscore', 'jquery'],
        jsrender: ['jquery'],
        validate: ['jquery'],
        messages: ['validate'],
        validatePlus: ['validate'],
        bootstrap: ['jquery'],
        ddsmoothmenu: ['jquery'],
        jPlugins: ['jquery', 'ddsmoothmenu'],
        cycle: ['jquery'],
        util: ['jquery', 'jsrender','backbone', 'sinon', 'validate', 'validatePlus', 'messages'],
        index_app: ['jsrender','jquery','util', 'ddsmoothmenu'],
        index: ['jquery','jsrender','util','bootstrap', 'cycle', 'jPlugins', 'index_app'],

    }
});
function loadCss(url) {
    var link = document.createElement("link");
    link.type = "text/css";
    link.rel = "stylesheet";
    link.href = require.toUrl('') + url;
    document.getElementsByTagName("head")[0].appendChild(link);
}
var module = location.pathname.replace(/;jsessionid.*/,'').slice(1);
module = module || 'index';
loadCss('css/' + module + '.css');
require([module]);
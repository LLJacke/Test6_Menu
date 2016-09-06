# Test6_Menu

##三种菜单都是最常见的菜单，设置方式各有不一样。
>###选项菜单OptionMenu
>系统的一个模板可以在界面文件中自动设置一个ToolBar控件作为选项菜单键，再写onCreateOptionMenu方法来创建菜单，OnOptionItemSelected方法来写入点击菜单项事件。

>###上下文菜单ContextMenu
>长按控件触发显示的菜单，只需要设置菜单项内容，不需要其他的界面设计。与选项菜单相同，需要两个方法onCreateContextMenu和OnContextItemSelected。

>###弹出菜单PopupMenu
>和上面两种不同，弹出菜单用点击事件触发创建菜单，用监听器Popup.OnMenuItemClickListener实现触发菜单项事件。

>###三种菜单我都用的相同的菜单资源文件，节省时间空间。

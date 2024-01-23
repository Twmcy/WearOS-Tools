# WearOS 管家

## 什么是WearOS 管家

一个免Root的手表工具箱，同时也支持手机给手机刷机，也可以手表刷机，支持自定义操作，免费开源，基于scene和autojs和pio部分代码，后面会加入WearOS Store

## Features

- **Execute Shell Commands**: Utilize `KeepShellPublic.doCmdSync()` to run Shell commands.

- **Display Custom Dialogs**: Use the `DialogHelper` class to show custom dialogs, including handling the "Emergency" and "Recovery" button clicks.

- **Check for Updates**: Employ the `Update` class to check for application updates, display update information, and provide download links.

## Usage

### Execute Shell Commands

Use `KeepShellPublic.doCmdSync("your_command_here")` in your code to execute Shell commands.

### Display Custom Dialogs

Use the `DialogHelper` class to display custom dialogs.

### Check for Updates

Check for application updates using the `Update` class.

## About

This section can include additional information about the project, such as the author, license, contact information, etc.

## Acknowledgments

Acknowledgments and thanks to any contributors or open-source projects related to this project.

## 感谢

Scene5 [Contributors](https://github.com/liuran001/GJZS/graphs/contributors)
pio [Contributors]
(https://github.com/helloklf/vtools/tree/scene)

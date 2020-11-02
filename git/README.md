# Git CLI Cheet Sheet

## Contents
[1. Excluding Version Control](excluding-version-control)
## Excluding Version Control
### before add & commit
* git ignore file 생성
    ``` zsh
    vi .gitignore
    ```
* 원하는 파일의 확장자를 아래와 같이 추가
    ``` zsh
    # 파일 확장자명이 .DS_Store 경우
    *.DS_Store
    # 폴더 이름이 test인 경우
    test
    ```
### after add & commit
* 이때는 .gitignore file에 확장자명을 추가해도 이미 버전관리 되고 있기 때문에 자동으로 삭제되지않아 수동으로 삭제해주는 작업이 필요하다
    ``` zsh
    # git rm --cached [파일명]
    # git rm --cached [폴더명] -r

    # 확장자가 있는 파일 ex).DS_Store file
    git rm --cached .DS_Store
    # 폴더(Directory) ex) test folder
    git rm --cached test -r
    ```
### .gitignore 자동생성
* 아래 웹 페이지에서 개발 환경(OS, IDEs, Programming Language...)을 입력하면 그에 맞는 .gitignore text를 생성해줌<br>
    gitignore.io
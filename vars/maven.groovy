def call(){
    figlet env.GIT_BRANCH
    if(env.GIT_BRANCH=='origin/release-v0.01'){
        mavencd.call()
    }
    else if(env.GIT_BRANCH=='feature-librery' || env.GIT_BRANCH=='develop'){
      mavenci.call()

    } 

  

}

return this;
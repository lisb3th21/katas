function areYouPlayingBanjo(name) {
    let result="";
    if(name[0]=='r' || name[0]=='R'){
        return `${name} plays banjo`;
    }else{
        return `${name} does not play banjo`
    }
  }
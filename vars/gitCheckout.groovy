def call(Map fnParams) {

checkout([
    $class: 'GitSCM', 
    branches: [  [name: fnParams.branch]],
    userRemoteConfigs: [[url: fnParams.url ]]
    ])
}
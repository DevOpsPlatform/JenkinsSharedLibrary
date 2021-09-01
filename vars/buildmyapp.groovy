
def call(props){

    node{
      stage("call method"){
          println "Sample stage from shared library $props.buidVersion "
      }
    }

}


def build(props){

    node{
      stage("build method"){
          println "Sample stage from shared library $props.buidVersion "
      }
    }

}

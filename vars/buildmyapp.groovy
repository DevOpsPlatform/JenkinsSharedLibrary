
def call(props){

    node{
      stage("sample"){
          println "Sample stage from shared library $props.buidVersion "
      }
    }

}


def build(props){

    node{
      stage("sample"){
          println "Sample stage from shared library $props.buidVersion "
      }
    }

}

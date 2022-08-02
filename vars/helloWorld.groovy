//def call() {
    
  //  sh "echo HELLO WORLD"
//}


def call(String name,String dayOfWeek) {
   sh "echo Hello ${name}. Today is ${dayOfWeek}"
}

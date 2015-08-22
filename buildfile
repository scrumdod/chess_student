repositories.remote << "http://repo.maven.apache.org/maven2/"
windowlicker = transitive("com.googlecode.windowlicker:windowlicker-swing:jar:r268")

define "chess" do
  project.version = "1.0.0"
  project.group = "ericminio.game"

  test.with windowlicker
  package :jar
  
  task :run => :compile do
    system 'java -cp target/classes Launcher'
  end
end

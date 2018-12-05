import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.triggers.schedule
import jetbrains.buildServer.configs.kotlin.v2018_2.vcs.SvnVcsRoot

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2018.2"

project {

    vcsRoot(HttpsLocalhost8443svnTest6)

    buildType(ForPortableFormat)
}

object ForPortableFormat : BuildType({
    name = "for portable format"

    steps {
        script {
            scriptContent = """echo "just command just commandjust commandjust commandjust commandjust commandjust commandjust commandjust command""""
        }
        script {
            name = "New build step"
            scriptContent = """echo "just command just commandjust commandjust commandjust commandjust commandjust commandjust commandjust command""""
        }
        script {
            name = "New build step (1)"
            scriptContent = """echo "just command just commandjust commandjust commandjust commandjust commandjust commandjust commandjust command""""
        }
        script {
            name = "New build step (1) (1)"
            scriptContent = """echo "just command just commandjust commandjust commandjust commandjust commandjust commandjust commandjust command""""
        }
        script {
            name = "New build step (1) (1) (1)"
            scriptContent = """echo "just command just commandjust commandjust commandjust commandjust commandjust commandjust commandjust command""""
        }
        script {
            name = "New build step (1) (1) (1) (1)"
            scriptContent = """echo "just command just commandjust commandjust commandjust commandjust commandjust commandjust commandjust command""""
        }
        script {
            name = "New build step (1) (1) (1) (1) (1)"
            scriptContent = """echo "just command just commandjust commandjust commandjust commandjust commandjust commandjust commandjust command""""
        }
    }

    triggers {
        schedule {
            branchFilter = ""
            triggerBuild = always()
        }
    }
})

object HttpsLocalhost8443svnTest6 : SvnVcsRoot({
    name = "https://localhost:8443/svn/test6/"
    url = "https://localhost:8443/svn/test6/"
    userName = "admin"
    password = "credentialsJSON:4e0a1988-c7ad-4e28-bf9a-feefacc89510"
})

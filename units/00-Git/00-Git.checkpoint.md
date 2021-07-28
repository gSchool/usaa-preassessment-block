# Git Assessment

This assessment helps determine which courses need to be taken and is *not* an evaluation of your job performance.  If you do not know the answer to a question, please do not try to research the answer, just leave it blank.  Guessing on a question or researching the answer can skew the results that help us identify what materials to cover.

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 99f58f7a-3e37-400e-9b3f-6c7e7e912d44
* title: Sending changes
* topics: git
##### !question
The `git ____` command sends the bundled changes from the local server to the central server.
##### !end-question
##### !answer
/push/
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: c3b9dc7b-9706-48e7-a7ed-8621875eae87
* title: Add changes from remote
* topics: git
##### !question
The `git _____` command will take changes from the remote repository and add them to your local repository.
##### !end-question
##### !answer
/^(git )?(pull|fetch)/
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 0ed0b31e-9e45-4643-a423-c27cfaace786
* title: Copy commits from remote
* topics: git
##### !question
Use the `git _____` command to copy commits from the remote server to the local repository and update the local reference for the branch without making changes to the source files.
##### !end-question
##### !answer
/fetch/
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: a62089e9-ba12-4c8a-ba5a-a4b5d42be7d3
* title: Combining branches
* topics: git
##### !question
To combine the changes made between two branches use the `git _____` command.
##### !end-question
##### !answer
/merge|rebase/
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 42ddb3ef-2a67-47c0-b2e3-05a8beb79b21
* title: The HEAD reference
* topics: git
##### !question
The HEAD represents (check all that apply):
##### !end-question
##### !options
* Which branch was last updated with a commit
* The commit that was last updated
* A snapshot of the filesystem at the commit it references
* Used to determine where the next commit should go
##### !end-options
##### !answer
* A snapshot of the filesystem at the commit it references
* Used to determine where the next commit should go
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: c944eb59-c357-4792-bac4-9acf40ce56fc
* title: Command to create a new branch
* topics: git
##### !question
Select which command will create a new branch on a repository.
##### !end-question
##### !options
* git commit --branch [branch name]
* git branch new --name [branch name]
* git commit --new-branch [branch name]
* git checkout -b [branch name]
##### !end-options
##### !answer
git checkout -b [branch name]
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 4db08dc4-008e-4615-8139-a5590ec8fc23
* title: Copy another repository
* topics: git
##### !question
_________ is the process of copying a central repository to your local development environment.
##### !end-question
##### !answer
/^(git )?(clone|cloning)/i
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

### !instructor
Ruby Regex test: https://rubular.com/r/dSwuG4ETP1kqfb
### !end-instructor

# Git Assessment

This assessment is to help determine which courses need to be taken and not an evaluation of your job performance.  If you do not know the answer to the question please do not try to research the answer, just leave it blank.  Guessing on a question or researching the answer could skew the results that help us identify what materials to cover.

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 9aa5f54c-0c31-402f-b6f1-c3af6370bda0
* title: What is the central server called?
* topics: git
##### !question
The central server where changes are sent is generally called the:
##### !end-question
##### !options
* Head
* Remote
* Main
* Trunk
##### !end-options
##### !answer
* Remote
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

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
* id: 2530a811-b61e-409e-922d-14f94bd2e2b5
* title: See a list of change bundles
* topics: git
##### !question
Which git command can you use to see a list of change bundles in your local repository?
##### !end-question
##### !answer
/(git )?log/
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
/(pull|fetch)/
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
* type: multiple-choice
* id: 854e7a16-6762-44fe-bb68-0217eed4ec3e
* title: Different histories
* topics: git
##### !question
When the commit histories are different between the local and remote branch then a _______ must happen to work the same branch locally.
##### !end-question
##### !options
* fetch merge
* fetch
* merge commit
* fetch commit
##### !end-options
##### !answer
* merge commit
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: 9323ea7e-4709-4d6e-909b-945228fbfa90
* title: Graph composition
* topics: git
##### !question
A graph is made up of ______ and _______.
##### !end-question
##### !options
* context and references
* items and pointers
* nodes and edges
* points and legs
##### !end-options
##### !answer
* nodes and edges
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: multiple-choice
* id: b812a825-92e6-46ce-9705-65c32b9eaa47
* title: Most recent commit position (command line)
* topics: git
##### !question
When viewing the Git DAG from the command line, the most recent commits are:
##### !end-question
##### !options
* At the bottom
* At the top
* To the left
* To the right
##### !end-options
##### !answer
* At the top
##### !end-answer
##### !explanation
##### !end-explanation
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
/merge/
##### !end-answer
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: checkbox
* id: 42ddb3ef-2a67-47c0-b2e3-05a8beb79b21
* title: What does the HEAD represent?
* topics: git
##### !question
The HEAD represents (check all that apply):
##### !end-question
##### !options
* Which branch was last updated with a commit
* The commit that was last updated
* Where you currently are in your file system
* Used to determine where the next commit should go
##### !end-options
##### !answer
* Where you currently are in your file system
* Used to determine where the next commit should go
##### !end-answer
##### !explanation
##### !end-explanation
### !end-challenge
<!--END CHALLENGE-->

<!--BEGIN CHALLENGE-->
### !challenge
* type: short-answer
* id: 94a0119c-13cd-48f8-a484-52dedd33c237
* title: Switching the HEAD
* topics: git
##### !question
Use the `git ______ [branch name]` command to switch the HEAD to another branch.
##### !end-question
##### !answer
/checkout/
##### !end-answer
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
* title: Copying a central repository to local
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

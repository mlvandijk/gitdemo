# Small demo project to demo Git workflows

## Git interactive rebase

Git interactive rebase allows you to change individual commits, squash commits together, drop commits or change the order of the commits.
This allows you to clean up your Git commit history to make it linear and meaningful, which can make it easier to understand
the history of the project in the future.

You can use the commits on branch `interactive-rebase` for practice. Check out this branch.

Open the Git window in IntelliJ IDEA using Command + 9 on Mac (or Alt + 9 on Windows & Linux).
In the Git log window we can see the commits that were made to the project. To see only the commits on branch `interactive-rebase`, select that branch at the top of the Git log window.

In the Git history, identify the commit from where you want to clean up your history. In this example that is the first failing test we added. The commit hash of this commit is `5b3469c8`.

Right-click on that commit and select "Interactively Rebase from Here". This will open a popup window with a list of the commits that were done on top of the selected commit.

When we select a commit, we can see the details of that commit, just as we can in the regular Git log window.
Notice there are several options at the top of this popup, that become active when we select one or more of the commits:

* **Reword** allows us to change the commit message of a specific commit.
* The **Squash** button is actually a dropdown that allows us to choose between **Squash** and **Fixup**. Both options will combine the changes made in the selected commits into one commit. If we select squash, by default the individual commit messages will be combined. If we select fixup, the commit message of the fixup commit will be discarded. You can select fixup with Option + F on Mac (or Alt + F on Windows & Linux)
* **Drop** allows us to drop one or more commits.

### Change the order of the commits
Let's say we want to change the order of the commits; we want to keep the unrelated change, but separately from the changes for the new feature.

In the popup, select that commit (in this example, the commit with the commit message "Unrelated changes") and use the up and down buttons on the top left to change where in the order this commit will be.
Move this commit all the way to the bottom and, once we're sure about the order, click the "Start rebasing" button on the bottom right of the popup.

### Combine multiple commits
Next, we want to combine multiple commits where we added the tests and the new feature.

Right-click on the commit from where we want to start (in this example, the commit hash of this commit is `5b3469c8`) and select "Interactively Rebase from Here".
In the popup, select that commit and all related commits that we want to squash together.
Now, because we want to combine those commits into one commit with one commit message we select Fixup instead of Squash in the dropdown at the top of the popup, and then select "Start rebasing".

### Drop a commit
Finally, we want to drop the commit with a mistake that we made.

Right-click on the commit from where we want to start (in this example, the commit hash of this commit is `5b3469c8`) and select "Interactively Rebase from Here".
Select the mistaken commit (in this example, the commit with the commit message "Mistake"), click the button "Drop" at the top of the popup and select "Start rebasing".

### Links
* YouTube link: https://www.youtube.com/watch?v=bPX9VHjviEM
* IntelliJ IDEA documentation: https://www.jetbrains.com/help/idea/edit-project-history.html#interactive-rebase
* Git rebase documentation: https://git-scm.com/docs/git-rebase

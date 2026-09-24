# Do not run this shell script
exit 0;

# Checking git's version
git --version

# Initialize a project in a directory:
git init

# Git's user configuration
git config --global user.name "<git name>"
git config --global user.email "<git email associated>"

git config --list

# Checking what git is registering
git status
git show

# Adding changes to the next commit
git add file # Wildcard . to add the whole directory

# Creating a commit
git commit -m "Message"

# Checking git's logs
git log

# Restoring to the last versions of the project
git restore file
git reset --hard commit_id

# Checking branches
git branch

# Creating branches
git branch branch_name

# Moving to a branch
git switch branch_name

# Merging branches
git merge other_branch_name

# Removing branches
git branch -d branch_to_remove

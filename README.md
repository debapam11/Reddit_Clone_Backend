# Reddit Clone

This is the backend for the reddit clone. The backed is made using spring boot. Configure the application using application.properties . Here master is replaced with main as per new convention.

## Git Project Setup

<ul>
    <li>
    Fork the git repo.
    </li>
    <li>
    git clone https://github.com/< your-repo >/Reddit_Clone_Backend.git
    </li>
    <li>
    cd Reddit_Clone_Backend
    </li>
    <li>
    git branch feature_branch
    </li>
</ul>

<b>Note: Always make a branch and then start developing. When commiting to git repo rebase and then merge it to your local main branch.</b>

## Git Commit

<ul>
    <li>
    git remote add upstream https://github.com/Persistent-Group6/Reddit_Clone_Backend.git
    </li>
    <li>
    git checkout feature_branch (always work on a diff branch from main)
    </li>
    <li>
    git fetch --all
    </li>
    <li>
    git rebase upstream/main
    </li>
    <li>
    git checkout master
    </li>
    <li>
    git merge feature_branch
    </li>
    <li>
    git push --force
    </li>
</ul>

## Build And Run Project

<ul>
    <li>
    'mvn clean install' - To download, build and install all packages.
    </li>
    <li>
    'mvn build' - To build the project.
    </li>
</ul>

## Database Setup

<ul>
    <li>In script folder run all sql files.
    </li>
</ul>

<b>
Note: Make short pull requests.
</b>

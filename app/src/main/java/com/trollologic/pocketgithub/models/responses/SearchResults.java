package com.trollologic.pocketgithub.models.responses;

import com.trollologic.pocketgithub.models.SearchItem;

/**
 * Created by miroslav on 02.02.17..
 */

public class SearchResults {

    private int total_count;
    private SearchItem[] items;

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public SearchItem[] getItems() {
        return items;
    }

    public void setItems(SearchItem[] items) {
        this.items = items;
    }

    /*
    "total_count": 2,
  "incomplete_results": false,
  "items": [
    {
      "id": 62625147,
      "name": "ProgressHandler",
      "full_name": "Trollologic/ProgressHandler",
      "owner": {
        "login": "Trollologic",
        "id": 15922309,
        "avatar_url": "https://avatars.githubusercontent.com/u/15922309?v=3",
        "gravatar_id": "",
        "url": "https://api.github.com/users/Trollologic",
        "html_url": "https://github.com/Trollologic",
        "followers_url": "https://api.github.com/users/Trollologic/followers",
        "following_url": "https://api.github.com/users/Trollologic/following{/other_user}",
        "gists_url": "https://api.github.com/users/Trollologic/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/Trollologic/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/Trollologic/subscriptions",
        "organizations_url": "https://api.github.com/users/Trollologic/orgs",
        "repos_url": "https://api.github.com/users/Trollologic/repos",
        "events_url": "https://api.github.com/users/Trollologic/events{/privacy}",
        "received_events_url": "https://api.github.com/users/Trollologic/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/Trollologic/ProgressHandler",
      "description": null,
      "fork": false,
      "url": "https://api.github.com/repos/Trollologic/ProgressHandler",
      "forks_url": "https://api.github.com/repos/Trollologic/ProgressHandler/forks",
      "keys_url": "https://api.github.com/repos/Trollologic/ProgressHandler/keys{/key_id}",
      "collaborators_url": "https://api.github.com/repos/Trollologic/ProgressHandler/collaborators{/collaborator}",
      "teams_url": "https://api.github.com/repos/Trollologic/ProgressHandler/teams",
      "hooks_url": "https://api.github.com/repos/Trollologic/ProgressHandler/hooks",
      "issue_events_url": "https://api.github.com/repos/Trollologic/ProgressHandler/issues/events{/number}",
      "events_url": "https://api.github.com/repos/Trollologic/ProgressHandler/events",
      "assignees_url": "https://api.github.com/repos/Trollologic/ProgressHandler/assignees{/user}",
      "branches_url": "https://api.github.com/repos/Trollologic/ProgressHandler/branches{/branch}",
      "tags_url": "https://api.github.com/repos/Trollologic/ProgressHandler/tags",
      "blobs_url": "https://api.github.com/repos/Trollologic/ProgressHandler/git/blobs{/sha}",
      "git_tags_url": "https://api.github.com/repos/Trollologic/ProgressHandler/git/tags{/sha}",
      "git_refs_url": "https://api.github.com/repos/Trollologic/ProgressHandler/git/refs{/sha}",
      "trees_url": "https://api.github.com/repos/Trollologic/ProgressHandler/git/trees{/sha}",
      "statuses_url": "https://api.github.com/repos/Trollologic/ProgressHandler/statuses/{sha}",
      "languages_url": "https://api.github.com/repos/Trollologic/ProgressHandler/languages",
      "stargazers_url": "https://api.github.com/repos/Trollologic/ProgressHandler/stargazers",
      "contributors_url": "https://api.github.com/repos/Trollologic/ProgressHandler/contributors",
      "subscribers_url": "https://api.github.com/repos/Trollologic/ProgressHandler/subscribers",
      "subscription_url": "https://api.github.com/repos/Trollologic/ProgressHandler/subscription",
      "commits_url": "https://api.github.com/repos/Trollologic/ProgressHandler/commits{/sha}",
      "git_commits_url": "https://api.github.com/repos/Trollologic/ProgressHandler/git/commits{/sha}",
      "comments_url": "https://api.github.com/repos/Trollologic/ProgressHandler/comments{/number}",
      "issue_comment_url": "https://api.github.com/repos/Trollologic/ProgressHandler/issues/comments{/number}",
      "contents_url": "https://api.github.com/repos/Trollologic/ProgressHandler/contents/{+path}",
      "compare_url": "https://api.github.com/repos/Trollologic/ProgressHandler/compare/{base}...{head}",
      "merges_url": "https://api.github.com/repos/Trollologic/ProgressHandler/merges",
      "archive_url": "https://api.github.com/repos/Trollologic/ProgressHandler/{archive_format}{/ref}",
      "downloads_url": "https://api.github.com/repos/Trollologic/ProgressHandler/downloads",
      "issues_url": "https://api.github.com/repos/Trollologic/ProgressHandler/issues{/number}",
      "pulls_url": "https://api.github.com/repos/Trollologic/ProgressHandler/pulls{/number}",
      "milestones_url": "https://api.github.com/repos/Trollologic/ProgressHandler/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/Trollologic/ProgressHandler/notifications{?since,all,participating}",
      "labels_url": "https://api.github.com/repos/Trollologic/ProgressHandler/labels{/name}",
      "releases_url": "https://api.github.com/repos/Trollologic/ProgressHandler/releases{/id}",
      "deployments_url": "https://api.github.com/repos/Trollologic/ProgressHandler/deployments",
      "created_at": "2016-07-05T09:51:15Z",
      "updated_at": "2016-07-05T09:55:54Z",
      "pushed_at": "2016-12-20T09:06:34Z",
      "git_url": "git://github.com/Trollologic/ProgressHandler.git",
      "ssh_url": "git@github.com:Trollologic/ProgressHandler.git",
      "clone_url": "https://github.com/Trollologic/ProgressHandler.git",
      "svn_url": "https://github.com/Trollologic/ProgressHandler",
      "homepage": null,
      "size": 200,
      "stargazers_count": 0,
      "watchers_count": 0,
      "language": "Java",
      "has_issues": true,
      "has_downloads": true,
      "has_wiki": true,
      "has_pages": false,
      "forks_count": 0,
      "mirror_url": null,
      "open_issues_count": 0,
      "forks": 0,
      "open_issues": 0,
      "watchers": 0,
      "default_branch": "master",
      "score": 17.06446
    }
    ]
     */
}

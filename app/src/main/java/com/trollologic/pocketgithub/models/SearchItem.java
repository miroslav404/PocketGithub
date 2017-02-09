package com.trollologic.pocketgithub.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by miroslav on 02.02.17..
 */

public class SearchItem implements Parcelable {

    private long id;
    private String name;
    private String full_name;
    private Owner owner;
    private String html_url;
    private String description;
    private boolean fork;
    private String url;
    private String forks_url;
    private String keys_url;
    private String collaborators_url;
    private String teams_url;
    private String hooks_url;
    private String issue_events_url;
    private String events_url;
    private String assignees_url;
    private String branches_url;
    private String tags_url;
    private String blobs_url;
    private String git_tags_url;
    private String git_refs_url;
    private String trees_url;
    private String statuses_url;
    private String languages_url;
    private String stargazers_url;
    private String contributors_url;
    private String subscribers_url;
    private String subscription_url;
    private String commits_url;
    private String git_commits_url;
    private String comments_utl;
    private String issue_comment_url;
    private String contents_url;
    private String created_at;
    private String updated_at;
    private String pushed_at;
    private String git_url;
    private String ssh_url;
    private String clone_url;
    private String issues_url;
    private String pulls_url;
    private int size;
    private int stargazers_count;
    private int watchers_count;
    private String language;
    private boolean has_issues;
    private boolean has_downloads;
    private boolean has_wiki;
    private boolean has_pages;
    private int forks_count;
    private int open_issues_count;
    private int forks;
    private int open_issues;
    private int watchers;
    private String default_branch;
    private double score;

    public String getIssues_url() {
        return issues_url;
    }

    public void setIssues_url(String issues_url) {
        this.issues_url = issues_url;
    }

    public String getPulls_url() {
        return pulls_url;
    }

    public void setPulls_url(String pulls_url) {
        this.pulls_url = pulls_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getForks_url() {
        return forks_url;
    }

    public void setForks_url(String forks_url) {
        this.forks_url = forks_url;
    }

    public String getKeys_url() {
        return keys_url;
    }

    public void setKeys_url(String keys_url) {
        this.keys_url = keys_url;
    }

    public String getCollaborators_url() {
        return collaborators_url;
    }

    public void setCollaborators_url(String collaborators_url) {
        this.collaborators_url = collaborators_url;
    }

    public String getTeams_url() {
        return teams_url;
    }

    public void setTeams_url(String teams_url) {
        this.teams_url = teams_url;
    }

    public String getHooks_url() {
        return hooks_url;
    }

    public void setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
    }

    public String getIssue_events_url() {
        return issue_events_url;
    }

    public void setIssue_events_url(String issue_events_url) {
        this.issue_events_url = issue_events_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    public String getAssignees_url() {
        return assignees_url;
    }

    public void setAssignees_url(String assignees_url) {
        this.assignees_url = assignees_url;
    }

    public String getBranches_url() {
        return branches_url;
    }

    public void setBranches_url(String branches_url) {
        this.branches_url = branches_url;
    }

    public String getTags_url() {
        return tags_url;
    }

    public void setTags_url(String tags_url) {
        this.tags_url = tags_url;
    }

    public String getBlobs_url() {
        return blobs_url;
    }

    public void setBlobs_url(String blobs_url) {
        this.blobs_url = blobs_url;
    }

    public String getGit_tags_url() {
        return git_tags_url;
    }

    public void setGit_tags_url(String git_tags_url) {
        this.git_tags_url = git_tags_url;
    }

    public String getGit_refs_url() {
        return git_refs_url;
    }

    public void setGit_refs_url(String git_refs_url) {
        this.git_refs_url = git_refs_url;
    }

    public String getTrees_url() {
        return trees_url;
    }

    public void setTrees_url(String trees_url) {
        this.trees_url = trees_url;
    }

    public String getStatuses_url() {
        return statuses_url;
    }

    public void setStatuses_url(String statuses_url) {
        this.statuses_url = statuses_url;
    }

    public String getLanguages_url() {
        return languages_url;
    }

    public void setLanguages_url(String languages_url) {
        this.languages_url = languages_url;
    }

    public String getStargazers_url() {
        return stargazers_url;
    }

    public void setStargazers_url(String stargazers_url) {
        this.stargazers_url = stargazers_url;
    }

    public String getContributors_url() {
        return contributors_url;
    }

    public void setContributors_url(String contributors_url) {
        this.contributors_url = contributors_url;
    }

    public String getSubscribers_url() {
        return subscribers_url;
    }

    public void setSubscribers_url(String subscribers_url) {
        this.subscribers_url = subscribers_url;
    }

    public String getSubscription_url() {
        return subscription_url;
    }

    public void setSubscription_url(String subscription_url) {
        this.subscription_url = subscription_url;
    }

    public String getCommits_url() {
        return commits_url;
    }

    public void setCommits_url(String commits_url) {
        this.commits_url = commits_url;
    }

    public String getGit_commits_url() {
        return git_commits_url;
    }

    public void setGit_commits_url(String git_commits_url) {
        this.git_commits_url = git_commits_url;
    }

    public String getComments_utl() {
        return comments_utl;
    }

    public void setComments_utl(String comments_utl) {
        this.comments_utl = comments_utl;
    }

    public String getIssue_comment_url() {
        return issue_comment_url;
    }

    public void setIssue_comment_url(String issue_comment_url) {
        this.issue_comment_url = issue_comment_url;
    }

    public String getContents_url() {
        return contents_url;
    }

    public void setContents_url(String contents_url) {
        this.contents_url = contents_url;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getPushed_at() {
        return pushed_at;
    }

    public void setPushed_at(String pushed_at) {
        this.pushed_at = pushed_at;
    }

    public String getGit_url() {
        return git_url;
    }

    public void setGit_url(String git_url) {
        this.git_url = git_url;
    }

    public String getSsh_url() {
        return ssh_url;
    }

    public void setSsh_url(String ssh_url) {
        this.ssh_url = ssh_url;
    }

    public String getClone_url() {
        return clone_url;
    }

    public void setClone_url(String clone_url) {
        this.clone_url = clone_url;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStargazers_count() {
        return stargazers_count;
    }

    public void setStargazers_count(int stargazers_count) {
        this.stargazers_count = stargazers_count;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isHas_issues() {
        return has_issues;
    }

    public void setHas_issues(boolean has_issues) {
        this.has_issues = has_issues;
    }

    public boolean isHas_downloads() {
        return has_downloads;
    }

    public void setHas_downloads(boolean has_downloads) {
        this.has_downloads = has_downloads;
    }

    public boolean isHas_wiki() {
        return has_wiki;
    }

    public void setHas_wiki(boolean has_wiki) {
        this.has_wiki = has_wiki;
    }

    public boolean isHas_pages() {
        return has_pages;
    }

    public void setHas_pages(boolean has_pages) {
        this.has_pages = has_pages;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public int getOpen_issues() {
        return open_issues;
    }

    public void setOpen_issues(int open_issues) {
        this.open_issues = open_issues;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public String getDefault_branch() {
        return default_branch;
    }

    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getWatchers_count() {
        return watchers_count;
    }

    public void setWatchers_count(int watchers_count) {
        this.watchers_count = watchers_count;
    }

    public int getOpen_issues_count() {
        return open_issues_count;
    }

    public void setOpen_issues_count(int open_issues_count) {
        this.open_issues_count = open_issues_count;
    }

    public int getForks_count() {
        return forks_count;
    }

    public void setForks_count(int forks_count) {
        this.forks_count = forks_count;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeString(this.full_name);
        dest.writeParcelable(this.owner, flags);
        dest.writeString(this.html_url);
        dest.writeString(this.description);
        dest.writeByte(this.fork ? (byte) 1 : (byte) 0);
        dest.writeString(this.url);
        dest.writeString(this.forks_url);
        dest.writeString(this.keys_url);
        dest.writeString(this.collaborators_url);
        dest.writeString(this.teams_url);
        dest.writeString(this.hooks_url);
        dest.writeString(this.issue_events_url);
        dest.writeString(this.events_url);
        dest.writeString(this.assignees_url);
        dest.writeString(this.branches_url);
        dest.writeString(this.tags_url);
        dest.writeString(this.blobs_url);
        dest.writeString(this.git_tags_url);
        dest.writeString(this.git_refs_url);
        dest.writeString(this.trees_url);
        dest.writeString(this.statuses_url);
        dest.writeString(this.languages_url);
        dest.writeString(this.stargazers_url);
        dest.writeString(this.contributors_url);
        dest.writeString(this.subscribers_url);
        dest.writeString(this.subscription_url);
        dest.writeString(this.commits_url);
        dest.writeString(this.git_commits_url);
        dest.writeString(this.comments_utl);
        dest.writeString(this.issue_comment_url);
        dest.writeString(this.contents_url);
        dest.writeString(this.created_at);
        dest.writeString(this.updated_at);
        dest.writeString(this.pushed_at);
        dest.writeString(this.git_url);
        dest.writeString(this.ssh_url);
        dest.writeString(this.clone_url);
        dest.writeInt(this.size);
        dest.writeInt(this.stargazers_count);
        dest.writeInt(this.watchers_count);
        dest.writeString(this.language);
        dest.writeByte(this.has_issues ? (byte) 1 : (byte) 0);
        dest.writeByte(this.has_downloads ? (byte) 1 : (byte) 0);
        dest.writeByte(this.has_wiki ? (byte) 1 : (byte) 0);
        dest.writeByte(this.has_pages ? (byte) 1 : (byte) 0);
        dest.writeInt(this.forks_count);
        dest.writeInt(this.open_issues_count);
        dest.writeInt(this.forks);
        dest.writeInt(this.open_issues);
        dest.writeInt(this.watchers);
        dest.writeString(this.default_branch);
        dest.writeDouble(this.score);
        dest.writeString(this.issues_url);
        dest.writeString(this.pulls_url);


    }

    public SearchItem() {
    }

    protected SearchItem(Parcel in) {
        this.id = in.readLong();
        this.name = in.readString();
        this.full_name = in.readString();
        this.owner = in.readParcelable(Owner.class.getClassLoader());
        this.html_url = in.readString();
        this.description = in.readString();
        this.fork = in.readByte() != 0;
        this.url = in.readString();
        this.forks_url = in.readString();
        this.keys_url = in.readString();
        this.collaborators_url = in.readString();
        this.teams_url = in.readString();
        this.hooks_url = in.readString();
        this.issue_events_url = in.readString();
        this.events_url = in.readString();
        this.assignees_url = in.readString();
        this.branches_url = in.readString();
        this.tags_url = in.readString();
        this.blobs_url = in.readString();
        this.git_tags_url = in.readString();
        this.git_refs_url = in.readString();
        this.trees_url = in.readString();
        this.statuses_url = in.readString();
        this.languages_url = in.readString();
        this.stargazers_url = in.readString();
        this.contributors_url = in.readString();
        this.subscribers_url = in.readString();
        this.subscription_url = in.readString();
        this.commits_url = in.readString();
        this.git_commits_url = in.readString();
        this.comments_utl = in.readString();
        this.issue_comment_url = in.readString();
        this.contents_url = in.readString();
        this.created_at = in.readString();
        this.updated_at = in.readString();
        this.pushed_at = in.readString();
        this.git_url = in.readString();
        this.ssh_url = in.readString();
        this.clone_url = in.readString();
        this.size = in.readInt();
        this.stargazers_count = in.readInt();
        this.watchers_count = in.readInt();
        this.language = in.readString();
        this.has_issues = in.readByte() != 0;
        this.has_downloads = in.readByte() != 0;
        this.has_wiki = in.readByte() != 0;
        this.has_pages = in.readByte() != 0;
        this.forks_count = in.readInt();
        this.open_issues_count = in.readInt();
        this.forks = in.readInt();
        this.open_issues = in.readInt();
        this.watchers = in.readInt();
        this.default_branch = in.readString();
        this.score = in.readDouble();
        this.issues_url = in.readString();
        this.pulls_url = in.readString();

    }

    public static final Parcelable.Creator<SearchItem> CREATOR = new Parcelable.Creator<SearchItem>() {
        @Override
        public SearchItem createFromParcel(Parcel source) {
            return new SearchItem(source);
        }

        @Override
        public SearchItem[] newArray(int size) {
            return new SearchItem[size];
        }
    };
}
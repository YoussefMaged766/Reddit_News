package com.example.redditnews.module

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity
data class NewsResponse(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("kind")
	val kind: String? = null
) :java.io.Serializable

data class SecureMedia(

	@field:SerializedName("oembed")
	val oembed: Oembed? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class ChildrenItem(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("kind")
	val kind: String? = null
)

data class Data(

	@field:SerializedName("geo_filter")
	val geoFilter: Any? = null,

	@field:SerializedName("modhash")
	val modhash: String? = null,

	@field:SerializedName("children")
	val children: List<ChildrenItem?>? = null,

	@field:SerializedName("before")
	val before: Any? = null,

	@field:SerializedName("dist")
	val dist: Int? = null,

	@field:SerializedName("after")
	val after: String? = null,

	@field:SerializedName("secure_media")
	val secureMedia: Any? = null,

	@field:SerializedName("saved")
	val saved: Boolean? = null,

	@field:SerializedName("hide_score")
	val hideScore: Boolean? = null,

	@field:SerializedName("total_awards_received")
	val totalAwardsReceived: Int? = null,

	@field:SerializedName("subreddit_id")
	val subredditId: String? = null,

	@field:SerializedName("score")
	val score: Int? = null,

	@field:SerializedName("num_comments")
	val numComments: Int? = null,

	@field:SerializedName("mod_reason_title")
	val modReasonTitle: Any? = null,

	@field:SerializedName("whitelist_status")
	val whitelistStatus: String? = null,

	@field:SerializedName("removed_by")
	val removedBy: Any? = null,

	@field:SerializedName("spoiler")
	val spoiler: Boolean? = null,

	@PrimaryKey
	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("created_utc")
	val createdUtc: Any? = null,

	@field:SerializedName("banned_at_utc")
	val bannedAtUtc: Any? = null,

	@field:SerializedName("discussion_type")
	val discussionType: Any? = null,

	@field:SerializedName("edited")
	val edited: Boolean? = null,

	@field:SerializedName("allow_live_comments")
	val allowLiveComments: Boolean? = null,

	@field:SerializedName("author_flair_background_color")
	val authorFlairBackgroundColor: Any? = null,

	@field:SerializedName("approved_by")
	val approvedBy: Any? = null,

	@field:SerializedName("media_embed")
	val mediaEmbed: MediaEmbed? = null,

	@field:SerializedName("top_awarded_type")
	val topAwardedType: Any? = null,

	@field:SerializedName("domain")
	val domain: String? = null,

	@field:SerializedName("approved_at_utc")
	val approvedAtUtc: Any? = null,

	@field:SerializedName("no_follow")
	val noFollow: Boolean? = null,

	@field:SerializedName("ups")
	val ups: Int? = null,

	@field:SerializedName("author_flair_type")
	val authorFlairType: String? = null,

	@field:SerializedName("permalink")
	val permalink: String? = null,

	@field:SerializedName("content_categories")
	val contentCategories: Any? = null,

	@field:SerializedName("wls")
	val wls: Int? = null,

	@field:SerializedName("author_flair_css_class")
	val authorFlairCssClass: Any? = null,

	@field:SerializedName("mod_reports")
	val modReports: List<Any?>? = null,

	@field:SerializedName("gilded")
	val gilded: Int? = null,

	@field:SerializedName("removal_reason")
	val removalReason: Any? = null,

	@field:SerializedName("send_replies")
	val sendReplies: Boolean? = null,

	@field:SerializedName("archived")
	val archived: Boolean? = null,

	@field:SerializedName("author_flair_text_color")
	val authorFlairTextColor: Any? = null,

	@field:SerializedName("can_mod_post")
	val canModPost: Boolean? = null,

	@field:SerializedName("is_self")
	val isSelf: Boolean? = null,

	@field:SerializedName("author_fullname")
	val authorFullname: String? = null,

	@field:SerializedName("link_flair_css_class")
	val linkFlairCssClass: Any? = null,

	@field:SerializedName("selftext")
	val selftext: String? = null,

	@field:SerializedName("upvote_ratio")
	val upvoteRatio: Any? = null,

	@field:SerializedName("selftext_html")
	val selftextHtml: String? = null,

	@field:SerializedName("user_reports")
	val userReports: List<Any?>? = null,

	@field:SerializedName("is_crosspostable")
	val isCrosspostable: Boolean? = null,

	@field:SerializedName("clicked")
	val clicked: Boolean? = null,

	@field:SerializedName("author_flair_template_id")
	val authorFlairTemplateId: Any? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("parent_whitelist_status")
	val parentWhitelistStatus: String? = null,

	@field:SerializedName("stickied")
	val stickied: Boolean? = null,

	@field:SerializedName("author_is_blocked")
	val authorIsBlocked: Boolean? = null,

	@field:SerializedName("quarantine")
	val quarantine: Boolean? = null,

	@field:SerializedName("view_count")
	val viewCount: Any? = null,

	@field:SerializedName("link_flair_richtext")
	val linkFlairRichtext: List<Any?>? = null,

	@field:SerializedName("link_flair_background_color")
	val linkFlairBackgroundColor: String? = null,

	@field:SerializedName("author_flair_richtext")
	val authorFlairRichtext: List<Any?>? = null,

	@field:SerializedName("over_18")
	val over18: Boolean? = null,

	@field:SerializedName("subreddit")
	val subreddit: String? = null,

	@field:SerializedName("suggested_sort")
	val suggestedSort: Any? = null,

	@field:SerializedName("can_gild")
	val canGild: Boolean? = null,

	@field:SerializedName("is_robot_indexable")
	val isRobotIndexable: Boolean? = null,

	@field:SerializedName("is_created_from_ads_ui")
	val isCreatedFromAdsUi: Boolean? = null,

	@field:SerializedName("author_premium")
	val authorPremium: Boolean? = null,

	@field:SerializedName("locked")
	val locked: Boolean? = null,

	@field:SerializedName("likes")
	val likes: Any? = null,

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("downs")
	val downs: Int? = null,

	@field:SerializedName("created")
	val created: Any? = null,

	@field:SerializedName("author")
	val author: String? = null,

	@field:SerializedName("treatment_tags")
	val treatmentTags: List<Any?>? = null,

	@field:SerializedName("link_flair_text_color")
	val linkFlairTextColor: String? = null,

	@field:SerializedName("gildings")
	val gildings: Gildings? = null,

	@field:SerializedName("report_reasons")
	val reportReasons: Any? = null,

	@field:SerializedName("is_video")
	val isVideo: Boolean? = null,

	@field:SerializedName("is_original_content")
	val isOriginalContent: Boolean? = null,

	@field:SerializedName("subreddit_name_prefixed")
	val subredditNamePrefixed: String? = null,

	@field:SerializedName("mod_reason_by")
	val modReasonBy: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("awarders")
	val awarders: List<Any?>? = null,

	@field:SerializedName("media_only")
	val mediaOnly: Boolean? = null,

	@field:SerializedName("num_reports")
	val numReports: Any? = null,

	@field:SerializedName("pinned")
	val pinned: Boolean? = null,

	@field:SerializedName("hidden")
	val hidden: Boolean? = null,

	@field:SerializedName("author_patreon_flair")
	val authorPatreonFlair: Boolean? = null,

	@field:SerializedName("mod_note")
	val modNote: Any? = null,

	@field:SerializedName("media")
	val media: Any? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("author_flair_text")
	val authorFlairText: Any? = null,

	@field:SerializedName("num_crossposts")
	val numCrossposts: Int? = null,

	@field:SerializedName("secure_media_embed")
	val secureMediaEmbed: SecureMediaEmbed? = null,

	@field:SerializedName("link_flair_text")
	val linkFlairText: Any? = null,

	@field:SerializedName("subreddit_type")
	val subredditType: String? = null,

	@field:SerializedName("is_meta")
	val isMeta: Boolean? = null,

	@field:SerializedName("subreddit_subscribers")
	val subredditSubscribers: Int? = null,

	@field:SerializedName("distinguished")
	val distinguished: Any? = null,

	@field:SerializedName("removed_by_category")
	val removedByCategory: Any? = null,

	@field:SerializedName("link_flair_type")
	val linkFlairType: String? = null,

	@field:SerializedName("all_awardings")
	val allAwardings: List<Any?>? = null,

	@field:SerializedName("visited")
	val visited: Boolean? = null,

	@field:SerializedName("pwls")
	val pwls: Int? = null,

	@field:SerializedName("category")
	val category: Any? = null,

	@field:SerializedName("banned_by")
	val bannedBy: Any? = null,

	@field:SerializedName("contest_mode")
	val contestMode: Boolean? = null,

	@field:SerializedName("is_reddit_media_domain")
	val isRedditMediaDomain: Boolean? = null,

	@field:SerializedName("media_metadata")
	val mediaMetadata: MediaMetadata? = null,

	@field:SerializedName("crosspost_parent")
	val crosspostParent: String? = null,

	@field:SerializedName("crosspost_parent_list")
	val crosspostParentList: List<CrosspostParentListItem?>? = null,

	@field:SerializedName("url_overridden_by_dest")
	val urlOverriddenByDest: String? = null
)

data class PItem(

	@field:SerializedName("u")
	val u: String? = null,

	@field:SerializedName("x")
	val x: Int? = null,

	@field:SerializedName("y")
	val y: Int? = null
)

data class Gildings(

	@field:SerializedName("gid_3")
	val gid3: Int? = null
)

data class MediaMetadata(

	@field:SerializedName("hytof65tzw1a1")
	val hytof65tzw1a1: Hytof65tzw1a1? = null,

	@field:SerializedName("2e50ha9tvq1a1")
	val jsonMember2e50ha9tvq1a1: JsonMember2e50ha9tvq1a1? = null
)

data class ResizedStaticIconsItem(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class JsonMember2e50ha9tvq1a1(

	@field:SerializedName("p")
	val p: List<PItem?>? = null,

	@field:SerializedName("s")
	val s: S? = null,

	@field:SerializedName("e")
	val e: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("m")
	val m: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class Hytof65tzw1a1(

	@field:SerializedName("p")
	val p: List<PItem?>? = null,

	@field:SerializedName("s")
	val s: S? = null,

	@field:SerializedName("e")
	val e: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("m")
	val m: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class AllAwardingsItem(

	@field:SerializedName("icon_width")
	val iconWidth: Int? = null,

	@field:SerializedName("end_date")
	val endDate: Any? = null,

	@field:SerializedName("award_sub_type")
	val awardSubType: String? = null,

	@field:SerializedName("days_of_drip_extension")
	val daysOfDripExtension: Int? = null,

	@field:SerializedName("coin_reward")
	val coinReward: Int? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("tiers_by_required_awardings")
	val tiersByRequiredAwardings: Any? = null,

	@field:SerializedName("awardings_required_to_grant_benefits")
	val awardingsRequiredToGrantBenefits: Any? = null,

	@field:SerializedName("resized_icons")
	val resizedIcons: List<ResizedIconsItem?>? = null,

	@field:SerializedName("coin_price")
	val coinPrice: Int? = null,

	@field:SerializedName("subreddit_coin_reward")
	val subredditCoinReward: Int? = null,

	@field:SerializedName("icon_format")
	val iconFormat: Any? = null,

	@field:SerializedName("award_type")
	val awardType: String? = null,

	@field:SerializedName("static_icon_url")
	val staticIconUrl: String? = null,

	@field:SerializedName("subreddit_id")
	val subredditId: Any? = null,

	@field:SerializedName("is_enabled")
	val isEnabled: Boolean? = null,

	@field:SerializedName("penny_price")
	val pennyPrice: Any? = null,

	@field:SerializedName("penny_donate")
	val pennyDonate: Any? = null,

	@field:SerializedName("static_icon_height")
	val staticIconHeight: Int? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("days_of_premium")
	val daysOfPremium: Int? = null,

	@field:SerializedName("start_date")
	val startDate: Any? = null,

	@field:SerializedName("icon_url")
	val iconUrl: String? = null,

	@field:SerializedName("is_new")
	val isNew: Boolean? = null,

	@field:SerializedName("icon_height")
	val iconHeight: Int? = null,

	@field:SerializedName("static_icon_width")
	val staticIconWidth: Int? = null,

	@field:SerializedName("count")
	val count: Int? = null,

	@field:SerializedName("resized_static_icons")
	val resizedStaticIcons: List<ResizedStaticIconsItem?>? = null,

	@field:SerializedName("giver_coin_reward")
	val giverCoinReward: Any? = null,

	@field:SerializedName("sticky_duration_seconds")
	val stickyDurationSeconds: Any? = null,

	@field:SerializedName("name")
	val name: String? = null
)

data class ResizedIconsItem(

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class MediaEmbed(

	@field:SerializedName("scrolling")
	val scrolling: Boolean? = null,

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class S(

	@field:SerializedName("u")
	val u: String? = null,

	@field:SerializedName("x")
	val x: Int? = null,

	@field:SerializedName("y")
	val y: Int? = null
)

data class CrosspostParentListItem(

	@field:SerializedName("secure_media")
	val secureMedia: Any? = null,

	@field:SerializedName("saved")
	val saved: Boolean? = null,

	@field:SerializedName("hide_score")
	val hideScore: Boolean? = null,

	@field:SerializedName("total_awards_received")
	val totalAwardsReceived: Int? = null,

	@field:SerializedName("subreddit_id")
	val subredditId: String? = null,

	@field:SerializedName("score")
	val score: Int? = null,

	@field:SerializedName("num_comments")
	val numComments: Int? = null,

	@field:SerializedName("mod_reason_title")
	val modReasonTitle: Any? = null,

	@field:SerializedName("whitelist_status")
	val whitelistStatus: String? = null,

	@field:SerializedName("removed_by")
	val removedBy: Any? = null,

	@field:SerializedName("spoiler")
	val spoiler: Boolean? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("created_utc")
	val createdUtc: Any? = null,

	@field:SerializedName("banned_at_utc")
	val bannedAtUtc: Any? = null,

	@field:SerializedName("discussion_type")
	val discussionType: Any? = null,

	@field:SerializedName("edited")
	val edited: Boolean? = null,

	@field:SerializedName("allow_live_comments")
	val allowLiveComments: Boolean? = null,

	@field:SerializedName("author_flair_background_color")
	val authorFlairBackgroundColor: Any? = null,

	@field:SerializedName("approved_by")
	val approvedBy: Any? = null,

	@field:SerializedName("media_embed")
	val mediaEmbed: MediaEmbed? = null,

	@field:SerializedName("top_awarded_type")
	val topAwardedType: Any? = null,

	@field:SerializedName("domain")
	val domain: String? = null,

	@field:SerializedName("approved_at_utc")
	val approvedAtUtc: Any? = null,

	@field:SerializedName("no_follow")
	val noFollow: Boolean? = null,

	@field:SerializedName("ups")
	val ups: Int? = null,

	@field:SerializedName("author_flair_type")
	val authorFlairType: String? = null,

	@field:SerializedName("permalink")
	val permalink: String? = null,

	@field:SerializedName("content_categories")
	val contentCategories: Any? = null,

	@field:SerializedName("wls")
	val wls: Int? = null,

	@field:SerializedName("author_flair_css_class")
	val authorFlairCssClass: Any? = null,

	@field:SerializedName("mod_reports")
	val modReports: List<Any?>? = null,

	@field:SerializedName("gilded")
	val gilded: Int? = null,

	@field:SerializedName("removal_reason")
	val removalReason: Any? = null,

	@field:SerializedName("send_replies")
	val sendReplies: Boolean? = null,

	@field:SerializedName("archived")
	val archived: Boolean? = null,

	@field:SerializedName("author_flair_text_color")
	val authorFlairTextColor: Any? = null,

	@field:SerializedName("can_mod_post")
	val canModPost: Boolean? = null,

	@field:SerializedName("is_self")
	val isSelf: Boolean? = null,

	@field:SerializedName("author_fullname")
	val authorFullname: String? = null,

	@field:SerializedName("link_flair_css_class")
	val linkFlairCssClass: Any? = null,

	@field:SerializedName("selftext")
	val selftext: String? = null,

	@field:SerializedName("upvote_ratio")
	val upvoteRatio: Any? = null,

	@field:SerializedName("selftext_html")
	val selftextHtml: String? = null,

	@field:SerializedName("user_reports")
	val userReports: List<Any?>? = null,

	@field:SerializedName("is_crosspostable")
	val isCrosspostable: Boolean? = null,

	@field:SerializedName("clicked")
	val clicked: Boolean? = null,

	@field:SerializedName("author_flair_template_id")
	val authorFlairTemplateId: Any? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("parent_whitelist_status")
	val parentWhitelistStatus: String? = null,

	@field:SerializedName("stickied")
	val stickied: Boolean? = null,

	@field:SerializedName("author_is_blocked")
	val authorIsBlocked: Boolean? = null,

	@field:SerializedName("quarantine")
	val quarantine: Boolean? = null,

	@field:SerializedName("view_count")
	val viewCount: Any? = null,

	@field:SerializedName("link_flair_richtext")
	val linkFlairRichtext: List<Any?>? = null,

	@field:SerializedName("link_flair_background_color")
	val linkFlairBackgroundColor: String? = null,

	@field:SerializedName("author_flair_richtext")
	val authorFlairRichtext: List<Any?>? = null,

	@field:SerializedName("over_18")
	val over18: Boolean? = null,

	@field:SerializedName("subreddit")
	val subreddit: String? = null,

	@field:SerializedName("suggested_sort")
	val suggestedSort: Any? = null,

	@field:SerializedName("can_gild")
	val canGild: Boolean? = null,

	@field:SerializedName("is_robot_indexable")
	val isRobotIndexable: Boolean? = null,

	@field:SerializedName("is_created_from_ads_ui")
	val isCreatedFromAdsUi: Boolean? = null,

	@field:SerializedName("author_premium")
	val authorPremium: Boolean? = null,

	@field:SerializedName("locked")
	val locked: Boolean? = null,

	@field:SerializedName("likes")
	val likes: Any? = null,

	@field:SerializedName("thumbnail")
	val thumbnail: String? = null,

	@field:SerializedName("downs")
	val downs: Int? = null,

	@field:SerializedName("created")
	val created: Any? = null,

	@field:SerializedName("author")
	val author: String? = null,

	@field:SerializedName("treatment_tags")
	val treatmentTags: List<Any?>? = null,

	@field:SerializedName("link_flair_text_color")
	val linkFlairTextColor: String? = null,

	@field:SerializedName("gildings")
	val gildings: Gildings? = null,

	@field:SerializedName("report_reasons")
	val reportReasons: Any? = null,

	@field:SerializedName("is_video")
	val isVideo: Boolean? = null,

	@field:SerializedName("is_original_content")
	val isOriginalContent: Boolean? = null,

	@field:SerializedName("subreddit_name_prefixed")
	val subredditNamePrefixed: String? = null,

	@field:SerializedName("mod_reason_by")
	val modReasonBy: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("awarders")
	val awarders: List<Any?>? = null,

	@field:SerializedName("media_only")
	val mediaOnly: Boolean? = null,

	@field:SerializedName("num_reports")
	val numReports: Any? = null,

	@field:SerializedName("pinned")
	val pinned: Boolean? = null,

	@field:SerializedName("hidden")
	val hidden: Boolean? = null,

	@field:SerializedName("author_patreon_flair")
	val authorPatreonFlair: Boolean? = null,

	@field:SerializedName("mod_note")
	val modNote: Any? = null,

	@field:SerializedName("media")
	val media: Any? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("author_flair_text")
	val authorFlairText: Any? = null,

	@field:SerializedName("num_crossposts")
	val numCrossposts: Int? = null,

	@field:SerializedName("secure_media_embed")
	val secureMediaEmbed: SecureMediaEmbed? = null,

	@field:SerializedName("link_flair_text")
	val linkFlairText: Any? = null,

	@field:SerializedName("subreddit_type")
	val subredditType: String? = null,

	@field:SerializedName("is_meta")
	val isMeta: Boolean? = null,

	@field:SerializedName("subreddit_subscribers")
	val subredditSubscribers: Int? = null,

	@field:SerializedName("distinguished")
	val distinguished: Any? = null,

	@field:SerializedName("removed_by_category")
	val removedByCategory: Any? = null,

	@field:SerializedName("link_flair_type")
	val linkFlairType: String? = null,

	@field:SerializedName("all_awardings")
	val allAwardings: List<Any?>? = null,

	@field:SerializedName("visited")
	val visited: Boolean? = null,

	@field:SerializedName("pwls")
	val pwls: Int? = null,

	@field:SerializedName("category")
	val category: Any? = null,

	@field:SerializedName("banned_by")
	val bannedBy: Any? = null,

	@field:SerializedName("contest_mode")
	val contestMode: Boolean? = null,

	@field:SerializedName("is_reddit_media_domain")
	val isRedditMediaDomain: Boolean? = null
)

data class Media(

	@field:SerializedName("oembed")
	val oembed: Oembed? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class SecureMediaEmbed(

	@field:SerializedName("scrolling")
	val scrolling: Boolean? = null,

	@field:SerializedName("media_domain_url")
	val mediaDomainUrl: String? = null,

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

data class Oembed(

	@field:SerializedName("author_name")
	val authorName: String? = null,

	@field:SerializedName("provider_url")
	val providerUrl: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("thumbnail_url")
	val thumbnailUrl: String? = null,

	@field:SerializedName("version")
	val version: String? = null,

	@field:SerializedName("thumbnail_height")
	val thumbnailHeight: Int? = null,

	@field:SerializedName("author_url")
	val authorUrl: String? = null,

	@field:SerializedName("thumbnail_width")
	val thumbnailWidth: Int? = null,

	@field:SerializedName("width")
	val width: Int? = null,

	@field:SerializedName("html")
	val html: String? = null,

	@field:SerializedName("provider_name")
	val providerName: String? = null,

	@field:SerializedName("height")
	val height: Int? = null
)

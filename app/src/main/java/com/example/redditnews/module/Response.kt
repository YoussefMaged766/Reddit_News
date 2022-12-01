package com.example.redditnews.module

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose


data class NewsData(
    val data: Data,
    val kind: String
)

data class Data(
    val after: String,
    val before: Any,
    val children: List<Children>,
    val dist: Int,
    val geo_filter: Any,
    val modhash: String
)

data class Children(
    val data: DataX,
    val kind: String
)

data class DataX(
    val all_awardings: List<AllAwarding>,
    val allow_live_comments: Boolean ?=null,
    val approved_at_utc: Any,
    val approved_by: Any,
    val archived: Boolean ?=null,
    val author: String ?=null,
    val author_flair_background_color: Any,
    val author_flair_css_class: Any,
    val author_flair_richtext: List<Any>,
    val author_flair_template_id: Any,
    val author_flair_text: Any,
    val author_flair_text_color: Any,
    val author_flair_type: String ?=null,
    val author_fullname: String ?=null,
    val author_is_blocked: Boolean ?=null,
    val author_patreon_flair: Boolean ?=null,
    val author_premium: Boolean ?=null,
    val awarders: List<Any>,
    val banned_at_utc: Any,
    val banned_by: Any,
    val can_gild: Boolean ?=null,
    val can_mod_post: Boolean ?=null,
    val category: Any,
    val clicked: Boolean ?=null,
    val content_categories: Any,
    val contest_mode: Boolean ?=null,
    val created: Double?=null,
    val created_utc: Double ?=null,
    val crosspost_parent: String ?=null,
    val crosspost_parent_list: List<CrosspostParent>,
    val discussion_type: Any,
    val distinguished: Any,
    val domain: String ?=null,
    val downs: Int ?=null,
//    val edited: Boolean?=null,
    val gilded: Int ?=null,
    val gildings: GildingsX,
    val hidden: Boolean ?=null,
    val hide_score: Boolean ?=null,
    val id: String,
    val is_created_from_ads_ui: Boolean ?=null,
    val is_crosspostable: Boolean ?=null,
    val is_meta: Boolean ?=null,
    val is_original_content: Boolean ?=null,
    val is_reddit_media_domain: Boolean ?=null,
    val is_robot_indexable: Boolean ?=null,
    val is_self: Boolean ?=null,
    val is_video: Boolean ?=null,
    val likes: Any,
    val link_flair_background_color: String ?=null,
    val link_flair_css_class: Any,
    val link_flair_richtext: List<Any>,
    val link_flair_text: Any,
    val link_flair_text_color: String ?=null,
    val link_flair_type: String ?=null,
    val locked: Boolean ?=null,
    val media: Media,
    val media_embed: MediaEmbedX,
    val media_metadata: MediaMetadata,
    val media_only: Boolean ?=null,
    val mod_note: Any,
    val mod_reason_by: Any,
    val mod_reason_title: Any,
    val mod_reports: List<Any>,
    val name: String ?=null,
    val no_follow: Boolean ?=null,
    val num_comments: Int ?=null,
    val num_crossposts: Int ?=null,
    val num_reports: Any,
    val over_18: Boolean ?=null,
    val parent_whitelist_status: String ?=null,
    val permalink: String ?=null,
    val pinned: Boolean ?=null,
    val pwls: Int ?=null,
    val quarantine: Boolean ?=null,
    val removal_reason: Any,
    val removed_by: Any,
    val removed_by_category: Any,
    val report_reasons: Any,
    val saved: Boolean ?=null,
    val score: Int ?=null,
    val secure_media: SecureMedia,
    val secure_media_embed: SecureMediaEmbedX,
    val selftext: String? = null,
    val selftext_html: String? = null,
    val send_replies: Boolean = true,
    val spoiler: Boolean? = null,
    val stickied: Boolean? = null,
    val subreddit: String? = null,
    val subreddit_id: String? = null,
    val subreddit_name_prefixed: String? = null,
    val subreddit_subscribers: Int? = null,
    val subreddit_type: String? = null,
    val suggested_sort: Any,
    val thumbnail: String? = null,
    val title: String? = null,
    val top_awarded_type: Any,
    val total_awards_received: Int?=null,
    val treatment_tags: List<Any>,
    val ups: Int?=null,
    val upvote_ratio: Double ?=null,
    val url: String?=null,
    val url_overridden_by_dest: String ?=null,
    val user_reports: List<Any>,
    val view_count: Any,
    val visited: Boolean ?=null,
    val whitelist_status: String ?=null,
    val wls: Int ?=null
)

data class AllAwarding(
    val award_sub_type: String,
    val award_type: String,
    val awardings_required_to_grant_benefits: Any,
    val coin_price: Int,
    val coin_reward: Int,
    val count: Int,
    val days_of_drip_extension: Int,
    val days_of_premium: Int,
    val description: String,
    val end_date: Any,
    val giver_coin_reward: Any,
    val icon_format: Any,
    val icon_height: Int,
    val icon_url: String,
    val icon_width: Int,
    val id: String,
    val is_enabled: Boolean,
    val is_new: Boolean,
    val name: String,
    val penny_donate: Any,
    val penny_price: Any,
    val resized_icons: List<ResizedIcon>,
    val resized_static_icons: List<ResizedStaticIcon>,
    val start_date: Any,
    val static_icon_height: Int,
    val static_icon_url: String,
    val static_icon_width: Int,
    val sticky_duration_seconds: Any,
    val subreddit_coin_reward: Int,
    val subreddit_id: Any,
    val tiers_by_required_awardings: Any
)

data class CrosspostParent(
    val all_awardings: List<Any>,
    val allow_live_comments: Boolean,
    val approved_at_utc: Any,
    val approved_by: Any,
    val archived: Boolean,
    val author: String,
    val author_flair_background_color: Any,
    val author_flair_css_class: Any,
    val author_flair_richtext: List<Any>,
    val author_flair_template_id: Any,
    val author_flair_text: Any,
    val author_flair_text_color: Any,
    val author_flair_type: String,
    val author_fullname: String,
    val author_is_blocked: Boolean,
    val author_patreon_flair: Boolean,
    val author_premium: Boolean,
    val awarders: List<Any>,
    val banned_at_utc: Any,
    val banned_by: Any,
    val can_gild: Boolean,
    val can_mod_post: Boolean,
    val category: Any,
    val clicked: Boolean,
    val content_categories: Any,
    val contest_mode: Boolean,
    val created: Double,
    val created_utc: Double,
    val discussion_type: Any,
    val distinguished: Any,
    val domain: String,
    val downs: Int,
    val edited: Boolean,
    val gilded: Int,
    val gildings: Gildings,
    val hidden: Boolean,
    val hide_score: Boolean,
    val id: String,
    val is_created_from_ads_ui: Boolean,
    val is_crosspostable: Boolean,
    val is_meta: Boolean,
    val is_original_content: Boolean,
    val is_reddit_media_domain: Boolean,
    val is_robot_indexable: Boolean,
    val is_self: Boolean,
    val is_video: Boolean,
    val likes: Any,
    val link_flair_background_color: String,
    val link_flair_css_class: Any,
    val link_flair_richtext: List<Any>,
    val link_flair_text: Any,
    val link_flair_text_color: String,
    val link_flair_type: String,
    val locked: Boolean,
    val media: Any,
    val media_embed: MediaEmbed,
    val media_only: Boolean,
    val mod_note: Any,
    val mod_reason_by: Any,
    val mod_reason_title: Any,
    val mod_reports: List<Any>,
    val name: String,
    val no_follow: Boolean,
    val num_comments: Int,
    val num_crossposts: Int,
    val num_reports: Any,
    val over_18: Boolean,
    val parent_whitelist_status: String,
    val permalink: String,
    val pinned: Boolean,
    val pwls: Int,
    val quarantine: Boolean,
    val removal_reason: Any,
    val removed_by: Any,
    val removed_by_category: Any,
    val report_reasons: Any,
    val saved: Boolean,
    val score: Int,
    val secure_media: Any,
    val secure_media_embed: SecureMediaEmbed,
    val selftext: String,
    val selftext_html: String,
    val send_replies: Boolean,
    val spoiler: Boolean,
    val stickied: Boolean,
    val subreddit: String,
    val subreddit_id: String,
    val subreddit_name_prefixed: String,
    val subreddit_subscribers: Int,
    val subreddit_type: String,
    val suggested_sort: Any,
    val thumbnail: String,
    val title: String,
    val top_awarded_type: Any,
    val total_awards_received: Int,
    val treatment_tags: List<Any>,
    val ups: Int,
    val upvote_ratio: Double,
    val url: String,
    val user_reports: List<Any>,
    val view_count: Any,
    val visited: Boolean,
    val whitelist_status: String,
    val wls: Int
)

data class GildingsX(
    val gid_3: Int
)

data class Media(
    val oembed: Oembed,
    val type: String
)

data class MediaEmbedX(
    val content: String,
    val height: Int,
    val scrolling: Boolean,
    val width: Int
)

data class MediaMetadata(
    val `2e50ha9tvq1a1`: E50ha9tvq1a1,
    val hytof65tzw1a1: Hytof65tzw1a1
)

data class SecureMedia(
    val oembed: Oembed,
    val type: String
)

data class SecureMediaEmbedX(
    val content: String,
    val height: Int,
    val media_domain_url: String,
    val scrolling: Boolean,
    val width: Int
)

data class ResizedIcon(
    val height: Int,
    val url: String,
    val width: Int
)

data class ResizedStaticIcon(
    val height: Int,
    val url: String,
    val width: Int
)

class Gildings

class MediaEmbed

class SecureMediaEmbed

data class Oembed(
    val author_name: String,
    val author_url: String,
    val height: Int,
    val html: String,
    val provider_name: String,
    val provider_url: String,
    val thumbnail_height: Int,
    val thumbnail_url: String,
    val thumbnail_width: Int,
    val title: String,
    val type: String,
    val version: String,
    val width: Int
)

data class E50ha9tvq1a1(
    val e: String,
    val id: String,
    val m: String,
    val p: List<P>,
    val s: S,
    val status: String
)

data class Hytof65tzw1a1(
    val e: String,
    val id: String,
    val m: String,
    val status: String
)

data class P(
    val u: String,
    val x: Int,
    val y: Int
)

data class S(
    val u: String,
    val x: Int,
    val y: Int
)
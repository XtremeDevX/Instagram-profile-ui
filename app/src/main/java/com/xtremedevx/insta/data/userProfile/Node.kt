package com.xtremedevx.insta.data.userProfile

data class Node(
    val __typename: String,
    val accessibility_caption: Any,
    val coauthor_producers: List<Any>,
    val comments_disabled: Boolean,
    val dimensions: Dimensions,
    val display_url: String,
    val edge_liked_by: EdgeLikedBy,
    val edge_media_preview_like: EdgeMediaPreviewLike,
    val edge_media_to_caption: EdgeMediaToCaption,
    val edge_media_to_comment: EdgeMediaToComment,
    val edge_media_to_tagged_user: EdgeMediaToTaggedUser,
    val fact_check_information: Any,
    val fact_check_overall_rating: Any,
    val gating_info: Any,
    val has_upcoming_event: Boolean,
    val id: String,
    val is_video: Boolean,
    val location: Any,
    val media_overlay_info: Any,
    val media_preview: String,
    val nft_asset_info: Any,
    val owner: Owner,
    val pinned_for_users: List<Any>,
    val sharing_friction_info: SharingFrictionInfo,
    val shortcode: String,
    val taken_at_timestamp: Int,
    val thumbnail_resources: List<ThumbnailResource>,
    val thumbnail_src: String
)
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.notes.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Note. This utility wraps
 * {@link com.liferay.notes.service.impl.NoteLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NoteLocalService
 * @see com.liferay.notes.service.base.NoteLocalServiceBaseImpl
 * @see com.liferay.notes.service.impl.NoteLocalServiceImpl
 * @generated
 */
@ProviderType
public class NoteLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.notes.service.impl.NoteLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the note to the database. Also notifies the appropriate model listeners.
	*
	* @param note the note
	* @return the note that was added
	*/
	public static com.liferay.notes.model.Note addNote(
		com.liferay.notes.model.Note note) {
		return getService().addNote(note);
	}

	/**
	* Creates a new note with the primary key. Does not add the note to the database.
	*
	* @param noteId the primary key for the new note
	* @return the new note
	*/
	public static com.liferay.notes.model.Note createNote(long noteId) {
		return getService().createNote(noteId);
	}

	/**
	* Deletes the note from the database. Also notifies the appropriate model listeners.
	*
	* @param note the note
	* @return the note that was removed
	*/
	public static com.liferay.notes.model.Note deleteNote(
		com.liferay.notes.model.Note note) {
		return getService().deleteNote(note);
	}

	/**
	* Deletes the note with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param noteId the primary key of the note
	* @return the note that was removed
	* @throws PortalException if a note with the primary key could not be found
	*/
	public static com.liferay.notes.model.Note deleteNote(long noteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteNote(noteId);
	}

	public static com.liferay.notes.model.Note fetchNote(long noteId) {
		return getService().fetchNote(noteId);
	}

	/**
	* Returns the note matching the UUID and group.
	*
	* @param uuid the note's UUID
	* @param groupId the primary key of the group
	* @return the matching note, or <code>null</code> if a matching note could not be found
	*/
	public static com.liferay.notes.model.Note fetchNoteByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchNoteByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the note with the primary key.
	*
	* @param noteId the primary key of the note
	* @return the note
	* @throws PortalException if a note with the primary key could not be found
	*/
	public static com.liferay.notes.model.Note getNote(long noteId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getNote(noteId);
	}

	/**
	* Returns the note matching the UUID and group.
	*
	* @param uuid the note's UUID
	* @param groupId the primary key of the group
	* @return the matching note
	* @throws PortalException if a matching note could not be found
	*/
	public static com.liferay.notes.model.Note getNoteByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getNoteByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the note in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param note the note
	* @return the note that was updated
	*/
	public static com.liferay.notes.model.Note updateNote(
		com.liferay.notes.model.Note note) {
		return getService().updateNote(note);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of notes.
	*
	* @return the number of notes
	*/
	public static int getNotesCount() {
		return getService().getNotesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.notes.model.impl.NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.notes.model.impl.NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the notes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.notes.model.impl.NoteModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @return the range of notes
	*/
	public static java.util.List<com.liferay.notes.model.Note> getNotes(
		int start, int end) {
		return getService().getNotes(start, end);
	}

	/**
	* Returns all the notes matching the UUID and company.
	*
	* @param uuid the UUID of the notes
	* @param companyId the primary key of the company
	* @return the matching notes, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.notes.model.Note> getNotesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getNotesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of notes matching the UUID and company.
	*
	* @param uuid the UUID of the notes
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of notes
	* @param end the upper bound of the range of notes (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching notes, or an empty list if no matches were found
	*/
	public static java.util.List<com.liferay.notes.model.Note> getNotesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.notes.model.Note> orderByComparator) {
		return getService()
				   .getNotesByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static NoteLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NoteLocalService, NoteLocalService> _serviceTracker =
		ServiceTrackerFactory.open(NoteLocalService.class);
}